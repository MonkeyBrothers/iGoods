package com.hry.igoods.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 生成图片名的工具
 */
public class IdUtil {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random RANDOM = new Random();

    /**
     * 获取到名字
     * @return
     */
    public static String genImageName() {
        int randomNum = RANDOM.nextInt(89999) + 10000;
        String time = SIMPLE_DATE_FORMAT.format(new Date());
        return time + randomNum;
    }
}
