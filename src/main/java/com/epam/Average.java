package com.epam;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Average {
    static final Scanner scanner = new Scanner(System.in);

     static OptionalDouble average(List<Double> list) {
        return list.
                stream().
                mapToDouble(value -> value).
                average();
    }
}

