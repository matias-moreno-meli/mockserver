import com.google.gson.Gson;
import org.mockserver.client.server.MockServerClient;
import org.mockserver.model.Delay;
import org.mockserver.model.Header;

import java.util.concurrent.TimeUnit;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

import static org.mockserver.integration.ClientAndServer.startClientAndServer;

public class Server {

    static MockServerClient mockServerClient = startClientAndServer(8081);
    static Gson gson;


    public static void consulta(String metodo, String ruta, int codigo, String content, String body, int delay) {
        mockServerClient.when(request()
                .withMethod(metodo)
                .withPath(ruta)).respond(
                response()
                        .withStatusCode(codigo)
                        .withHeader(new Header("Content-Type", content))
                        .withBody(body)
                        .withDelay(new Delay(TimeUnit.MICROSECONDS, delay))
        );
    }

    public static void main(String[] args) {

        gson = new Gson();
        Item item = new Item(1234);

        consulta("GET", "/items/.*", 200, "application/json; charset=utf-8", gson.toJson(item), 100000);
        consulta("GET", "/sites/", 200, "application/json; charset=utf-8", Site.getSites(), 100000);
        consulta("GET", "/sites/.*", 200, "application/json; charset=utf-8", Site.getSite(), 100000);
        consulta("GET", "/countries/", 200, "application/json; charset=utf-8", Country.getCountries(), 100000);
        consulta("GET", "/countries/.*", 200, "application/json; charset=utf-8", Country.getCountry(), 100000);
        consulta("GET", "/users/.*", 200, "application/json; charset=utf-8", User.getUser(), 100000);

    }

}
