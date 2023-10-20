package com.example.expenses.readers.file;

import com.example.expenses.readers.Reader;

public class FileReader implements Reader {
    @Override
    public String read(final String path) {
        return "file";
    }
}