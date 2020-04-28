package com.text.recognition.tess4j.controller;

import lombok.Data;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author libo
 */
public class Sample {

    public static final String APP_ID = "19092144";
    public static final String API_KEY = "tz0HoD4GviaZvCizPcuzpkCG";
    public static final String SECRET_KEY = "rgE2Rw4aYxC6d0dEoeR4DmGrpWaQsDoQ";

    @Data
    static
    class A {
        private String name;
        private String age;
    }

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        boolean contains = strings.contains("1");
        String regex = "^[-]?(([1-9][0-9]*)|(([0]\\.\\d{1,4}|[1-9][0-9]*\\.\\d{1,4})))$\\n";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("123456789");
        matcher.matches();


        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        System.out.println(collect.toString());
        Consumer<String> consumer = x->{
            if (x.equals("1")){
                System.out.println("xxxx");
            } else {
                System.out.println("yyyy");
            }
        };
        list.forEach(consumer);
    }
}
