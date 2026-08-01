import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

void main() {
    String accessToken = System.getenv("MOVIE_API_ACCESS_TOKEN");
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.themoviedb.org/3/search/tv?query=the%20100"))
            .header("Accept", "application/json")
            .header("Authorization", "Bearer " + accessToken)
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();

    try (var client = HttpClient.newHttpClient()) {
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        IO.println(response.body());
    } catch (InterruptedException | IOException e) {
        e.printStackTrace(System.err);
    }
}