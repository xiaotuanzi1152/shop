package com.xjt.jihe;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("name","张三");
        hashMap.put("name","李四");
        System.out.println(hashMap);
    }
}
