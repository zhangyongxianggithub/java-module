package com.example.expenses.readers.http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import com.example.expenses.readers.Reader;

import lombok.extern.slf4j.Slf4j;

import static java.net.http.HttpClient.Redirect.NORMAL;

/**
 * @author zyxue
 */
@Slf4j
public class HttpReader implements Reader {
    
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1).followRedirects(NORMAL)
            .connectTimeout(Duration.ofSeconds(10)).build();
    
    @Override
    public String read(final String path) {
        final HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(path)).build();
        try {
            final HttpResponse<String> response = httpClient.send(request,
                    HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (final Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static void main(final String[] args) {
        final Reader reader = new HttpReader();
        System.err.println(reader.read("http://openjdk.org/"));
    }
}