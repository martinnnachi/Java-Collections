package com.martinnnachi.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compile high level, object oriented, platform independent language");
        languages.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "Algorithmic language");
        languages.put("BASIC", "Beginners All-purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness!");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about Java");
        }
        System.out.println(languages.get("Java"));
        System.out.println("================================================================");

        if (languages.remove("Algol", "A family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed. Key not found");
        }

        System.out.println("================================================================");

        System.out.println(languages.replace("Lisp", "A functional language with imperative features"));
        System.out.println(languages.replace("Scala", "This will not be added"));

        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
