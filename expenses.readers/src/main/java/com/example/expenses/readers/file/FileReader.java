package com.example.expenses.readers.file;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.example.expenses.readers.Reader;

import static java.util.stream.Collectors.joining;

public class FileReader implements Reader {
    @Override
    public String read(final String path) {
        final InputStream inputStream = this.getClass()
                .getResourceAsStream(path);
        final BufferedReader reader = new BufferedReader(
                new InputStreamReader(inputStream));
        return reader.lines().collect(joining("\n"));
    }
}