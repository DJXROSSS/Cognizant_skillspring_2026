package Upskilling.Core_Java;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Q36_HttpClientApi {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://api.github.com"))
                .header("User-Agent", "Java-HttpClient")
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status: " + response.statusCode());
            System.out.println(response.body());
        } catch (IOException | InterruptedException exception) {
            System.out.println("HTTP error: " + exception.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
