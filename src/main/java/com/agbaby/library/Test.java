package com.agbaby.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        //String[] names = new String[45];
        ArrayList<String> names = new ArrayList<>();



        names.add("Joe");
        names.add("John");
        names.add("Dell");
        names.add("John");

        System.out.println(names);

        //names.remove("John");
        names.remove("John");
        names.clear();
        System.out.println(names);
    }
}
