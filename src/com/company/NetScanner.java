package com.company;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class NetScanner {
    HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2)
            .build();

    public int scan(String url, String path) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder(URI.create(url+path)).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

       return response.statusCode();
    }



}
