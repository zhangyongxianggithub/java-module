module expenses.readers {
    requires java.base;
    requires java.net.http;
    exports com.example.expenses.readers;
    exports com.example.expenses.readers.file;
    exports com.example.expenses.readers.http;
}