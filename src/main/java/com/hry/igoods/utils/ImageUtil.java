package com.hry.igoods.utils;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Position;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;

public class ImageUtil {
    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    public static String generateThumbnail(CommonsMultipartFile multipartFile, String targetAddr) {
        String realFileName = IdUtil.genImageName();
        String extendsion = getFileExtension(multipartFile);
        makeDirPath(targetAddr);
        // 设置新的相对地址
        String relativeAddr = targetAddr + realFileName + extendsion;
        File dest = new File(PathUtil.getImageBasePath() + relativeAddr);
        try {
            Thumbnails.of(multipartFile.getInputStream()).size(200, 200).watermark(Position.B)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建目录
     * @param targetAddr
     */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImageBasePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }
    }

    /**
     * 获取输入文件流扩展名
     * @param multipartFile
     * @return
     */
    private static String getFileExtension(CommonsMultipartFile multipartFile) {
        String  originalFileName = multipartFile.getOriginalFilename();
        return originalFileName.substring(originalFileName.lastIndexOf("."));
    }
}
