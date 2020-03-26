package com.text.recognition.tess4j.service;

/**
 * @author libo
 */
public interface ITess4jService {

    /**
     * 文字识别接口
     *
     * @param fileBytes 文件byte数组
     * @return 识别后的文字
     */
    String getTess4jRecognition(byte[] fileBytes);
}
