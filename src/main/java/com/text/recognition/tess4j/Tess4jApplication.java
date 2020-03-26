package com.text.recognition.tess4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author libo
 */
@SpringBootApplication
public class Tess4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tess4jApplication.class, args);
        System.out.println(
                "   _____                   __         ________          _          _______                           \n" +
                "  / ___/__  ______  ____  / /_  __   / ____/ /_  ____ _(_)___     / ____(_)___  ____ _____  ________ \n" +
                "  \\__ \\/ / / / __ \\/ __ \\/ / / / /  / /   / __ \\/ __ `/ / __ \\   / /_  / / __ \\/ __ `/ __ \\/ ___/ _ \\\n" +
                " ___/ / /_/ / /_/ / /_/ / / /_/ /  / /___/ / / / /_/ / / / / /  / __/ / / / / / /_/ / / / / /__/  __/\n" +
                "/____/\\__,_/ .___/ .___/_/\\__, /   \\____/_/ /_/\\__,_/_/_/ /_/  /_/   /_/_/ /_/\\__,_/_/ /_/\\___/\\___/ \n" +
                "          /_/   /_/      /____/                                                                      \n" +
                "\n" +
                "文字识别服务，启动成功");
    }

}
