module expenses.readers {
    requires java.base;
    requires java.net.http;
    requires lombok.extern.slf4j;
    exports com.example.expenses.readers;
    exports com.example.expenses.readers.file;
    exports com.example.expenses.readers.http;
}