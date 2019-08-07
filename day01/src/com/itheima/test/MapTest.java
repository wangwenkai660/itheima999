package com.itheima.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map id = new HashMap();
        id.put("type", "long");
        id.put("store", "yes");
        System.out.println(id);
        System.out.println("===============");

        Map content = new HashMap();
        content.put("type", "string");
        content.put("store", "yes");
        content.put("analyzer", "ik_smart");
        System.out.println(content);
        System.out.println("===============");

        Map title = new HashMap();
        title.put("type", "string");
        title.put("store", "yes");
        title.put("analyzer", "ik_smart");
        System.out.println(title);
        System.out.println("===============");

        Map properties = new HashMap();
        properties.put("id", id);
        properties.put("content", content);
        properties.put("title", title);
        System.out.println(properties);
        System.out.println("===============");

        Map article = new HashMap();
        article.put("properties", properties);
        System.out.println(article);
        System.out.println("===============");

        Map mappings = new HashMap();
        mappings.put("article", article);
        System.out.println(mappings);

    }
}
