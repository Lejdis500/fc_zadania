package Lesson12Task1;

import javax.swing.text.html.HTML;
import java.net.URI;

public class Website {
    public static void main(String[] args) {

        HTMLClient httpClient = HTMLClient.newBuilder().build();
        try {

            HTMLRequest httpRequest = HTMLRequest.newBuilder(new URI("https://futurecollars.com/"))
                    .GET()
                    .build();

            HTMLResponse<String> HMlResponse = httpClient
                    .send(httpRequest, HTMLpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            String body = httpResponse.body();
            System.out.println(statusCode);
            System.out.println(body);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
