package com.text.recognition.tess4j.controller;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * @author libo
 */
public class Sample {

    public static final String APP_ID = "19092144";
    public static final String API_KEY = "tz0HoD4GviaZvCizPcuzpkCG";
    public static final String SECRET_KEY = "rgE2Rw4aYxC6d0dEoeR4DmGrpWaQsDoQ";

    public static void main(String[] args) {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
        HashMap<String, String> options = new HashMap<>(10);
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        // 调用接口
        String path = "E:\\2012\\888.jpg";
        JSONObject res = client.webImage(path, options);
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
        String substring = stringBuffer.substring(1);
        System.out.println(substring);
    }
}
