package com.epam;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class checkPalindrome {
     static final Scanner scanner = new Scanner(System.in);

     static List<String> palindromes(List<String> list) {
        return list.
                stream().
                filter(str -> new StringBuilder(str).reverse().toString().equals(str)).
                collect(Collectors.toList());
    }
}
