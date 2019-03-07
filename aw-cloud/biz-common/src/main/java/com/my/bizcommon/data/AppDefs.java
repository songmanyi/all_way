package com.my.bizcommon.data;

public class AppDefs {

    public enum ResultMessage {
        MSG_OK(0, "ok"),
        MSG_USER_NOTEXIST(10, "invalid username"),
        MSG_PASSWORD_ERROR(11, "password error"),
        MSG_USER_OR_PASSWORD_ERROR(12, "invalid username or password error"),
        MSG_DEVICE_NOTEXIST(20, "invalid device"),
        MSG_DEVICE_EXPIRED(21,"device expired"),
        MSG_DEVICE_NOTANTHORIZED(22,"device unAnthorized"),
        MSG_EDIT_ERROR(400301, "edit error"),
        MSG_SERVER_ERROR(40, "server error"),
        MSG_PARAM_ERROR(100, "param invalid"),
        MSG_WITH_FILTER_OK(120, "with filter success"),
        MSG_WITH_OUT_FILTER_OK(1210, "without filter success"),
        MSG_NO_TOKEN(122, "invalid token or token is empty"),
        MSG_PASSWORD_INVALID(124,"password is not match"),
        MSG_UNAUTHORIZED(401,"Unauthorized,Token Is Empty Or Invaild!");

        private int    code;
        private String message;

        private ResultMessage(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }
    }

}
