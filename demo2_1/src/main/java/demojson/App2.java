package demojson;

public class App2 {
    public static void main(String[] args) {
        try {
            var client = java.net.http.HttpClient.newHttpClient();
            var req = java.net.http.HttpRequest.newBuilder(
                    java.net.URI.create("https://www.deckofcardsapi.com/api/deck/new/shuffle/"))
                    .build();
            var res = client.send(req, java.net.http.HttpResponse.BodyHandlers.ofString());
            System.out.println(res.body()); // récupérez deck_id, puis appelez /draw/?
            // retrouver le deck_id dans la réponse JSON
            var mapper = new com.fasterxml.jackson.databind.ObjectMapper();
            var node = mapper.readTree(res.body());
            var deckId = node.get("deck_id").asText();
            System.out.println("Deck ID: " + deckId);
            // faire une autre requête pour piocher 5 cartes à paertir du deckId
            var req2 = java.net.http.HttpRequest.newBuilder(
                    java.net.URI.create("https://www.deckofcardsapi.com/api/deck/" + deckId + "/draw/?count=5"))
                    .build();
            var res2 = client.send(req2, java.net.http.HttpResponse.BodyHandlers.ofString());
            System.out.println(res2.body());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
