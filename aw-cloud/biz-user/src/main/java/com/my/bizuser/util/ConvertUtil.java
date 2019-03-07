package com.my.bizuser.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

public class ConvertUtil {

    private static Logger logger = LoggerFactory.getLogger(ConvertUtil.class);

    public static Object convertToDTO(Object source, Class tClass) {
        try {
            Object target = tClass.newInstance();
            BeanUtils.copyProperties(source, target);
            return target;
        } catch (Exception e) {
            logger.error("转换对象失败", e);
            return null;
        }
    }

}
