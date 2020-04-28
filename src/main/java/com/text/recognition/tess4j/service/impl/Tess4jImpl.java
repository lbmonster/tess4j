package com.text.recognition.tess4j.service.impl;

import com.baidu.aip.ocr.AipOcr;
import com.text.recognition.tess4j.service.ITess4jService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author libo
 */
@Service
public class Tess4jImpl implements ITess4jService {

    public static final String APP_ID = "19092144";
    public static final String API_KEY = "tz0HoD4GviaZvCizPcuzpkCG";
    public static final String SECRET_KEY = "rgE2Rw4aYxC6d0dEoeR4DmGrpWaQsDoQ";

    @Override
    public String getTess4jRecognition(byte[] fileBytes) {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
        HashMap<String, String> options = new HashMap<>(10);
//        options.put("detect_direction", "true");
//        options.put("detect_language", "true");
        options.put("recognize_granularity", "big");
        options.put("probability", "true");
        options.put("accuracy", "normal");
        options.put("detect_direction", "true");
        // 调用接口
//        String path = "E:\\2012\\888.jpg";
        JSONObject res = client.receipt(fileBytes, options);
        StringBuilder stringBuffer = new StringBuilder();
        Object result = res.get("words_result");
        if (result instanceof JSONArray) {
            JSONArray resultArray = (JSONArray) result;
            for (Object object : resultArray) {
                if (object instanceof JSONObject) {
                    JSONObject jsonObject = (JSONObject) object;
                    Object words = jsonObject.get("words");
                    stringBuffer.append(",").append(words);
                }
            }
        }
        return stringBuffer.substring(1);
    }
}
