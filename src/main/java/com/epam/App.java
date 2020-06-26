package com.epam;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.epam.Average.average;
import static com.epam.StringTask.filter;
import static com.epam.checkPalindrome.palindromes;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Please enter 10 numbers to get their average:");
        average(Stream.generate(Average.scanner::nextDouble).
                limit(10).
                collect(Collectors.toList())).
                ifPresent(System.out::println);

        System.out.println("Please enter 10 numbers to find whether they are palindrome or not:");
        palindromes(Stream.generate(checkPalindrome.scanner::nextLine).
                limit(10).
                collect(Collectors.toList())).
                forEach(System.out::println);

        System.out.println("Please enter 10 words to find which string starts with 'a' and has 3 characters:");
        filter(Stream.generate(StringTask.scanner::nextLine).
                limit(10).
                collect(Collectors.toList())).
                forEach(System.out::println);
    }
}
