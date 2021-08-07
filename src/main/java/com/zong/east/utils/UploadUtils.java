package com.zong.east.utils;

import java.io.File;

/**
 * @ClassName UploadUtil
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/9 17:48
 * @Version 1.0
 */
public class UploadUtils {

    // 项目根路径下的目录  -- SpringBoot static 目录相当于是根路径下（SpringBoot 默认）
    public final static String IMG_PATH_PREFIX = "upload";

    public static File getImgDirFile(){

        // 构建上传文件的存放 "文件夹" 路径
        String fileDirPath = new String("boot-web/src/main/resources/" + IMG_PATH_PREFIX);

        File fileDir = new File(fileDirPath);
        if(!fileDir.exists()){
            // 递归生成文件夹
            fileDir.mkdirs();
        }
        return fileDir;
    }
}
