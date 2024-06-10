package principal;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultMoney {

    public Money convertMoney(String firstMoney, String secondMoney, double amount){
      URI url = URI.create("https://v6.exchangerate-api.com/v6/7b3852827a8b81d77d50d390/pair/" + firstMoney +"/"+ secondMoney +"/"+ amount);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Money.class);
        }catch (IOException | InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public Money conversionCup(String firstMoney, String secondMoney){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/7b3852827a8b81d77d50d390/pair/" + firstMoney +"/"+ secondMoney);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Money.class);
        }catch (IOException | InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}













