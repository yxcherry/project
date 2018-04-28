package com.mt.service.example;

import java.util.Set;

import lombok.Builder;
import lombok.Singular;

@Builder
public class BuilderExample {
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;
    public static void main(String[] args) {
        BuilderExample test = BuilderExample.builder().age(11).name("test").build();
        System.out.println(test);
    }
}
