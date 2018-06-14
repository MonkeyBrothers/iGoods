package com.hry.igoods.utils;

public class PathUtil {
    // 获取当前路径的分隔符
    private static String seperator = System.getProperty("file.separator");

    /**
     * 编写获取图片存储路径的方法
     * @return
     */
    public static String getImageBasePath() {
        String os = System.getProperty("os.name");
        String basePath="";
        // 如果当前系统是Windows
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/project/images/";

        } else {
            // 其他系统
            basePath = "/home/hry/images/";
        }
        // 替换斜杠为当前系统分隔符
        basePath = basePath.replace("/", seperator);
        return basePath;
    }

    /**
     * 获取店铺图片存储路径
     * @param shopId
     * @return
     */
    public static String getShopImagepath(long shopId) {
        String imagePath = "/upload/item/shop/" + shopId + "/";
        return imagePath.replace("/", seperator);
    }
}
