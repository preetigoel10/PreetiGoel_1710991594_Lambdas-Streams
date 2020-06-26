package com.epam;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class StringTask {
    static final Scanner scanner = new Scanner(System.in);
    static List<String> filter(List<String> list) {
        return list.
                stream().
                filter(str -> str.startsWith("a") && str.length() == 3).
                collect(Collectors.toList());
    }
}

