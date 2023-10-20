package com.example.expenses.application;

import com.example.expenses.readers.Reader;
import com.example.expenses.readers.http.HttpReader;

public class ExpensesApplication {
    public static void main(final String... args) {
        System.out.println("my first java module app");
        final Reader reader = new HttpReader();
        System.err.println(reader.read("http://www.baidu.com"));
    }
}
