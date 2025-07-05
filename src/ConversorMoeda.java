import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoeda {
    public MoedaER buscaMoeda(String sigla_um, String sigla_dois,Double quantidade){
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/SUA_API/pair/" +
                sigla_um + "/" + sigla_dois + "/" + quantidade);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try{
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MoedaER.class);
        }catch(Exception e){
            throw new RuntimeException("Houve algum erro");
        }

    }
}
