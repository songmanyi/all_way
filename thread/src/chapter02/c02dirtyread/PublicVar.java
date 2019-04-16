package chapter02.c02dirtyread;

public class PublicVar {

    private String username = "A";
    private String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("设置成功：username=" + username + ", password=" + password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void getValue() {
        System.out.println("当前值：username=" + username + ", password=" + password);
    }

}
