package aula_7.CalculadoraSelic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SelicAPI {

    static class Selic {
        public String data;
        public String valor;
    }

    public static double obterTaxaSelic() {
        try {
            String apiUrl = "https://api.bcb.gov.br/dados/serie/bcdata.sgs.11/dados/ultimos/1?formato=json";

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder json = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null) {
                json.append(linha);
            }
            reader.close();

            ObjectMapper mapper = new ObjectMapper();
            Selic[] selicArray = mapper.readValue(json.toString(), Selic[].class);

            if (selicArray.length > 0) {
                return Double.parseDouble(selicArray[0].valor.replace(",", "."));
            }
        } catch (Exception e) {
            System.out.println("Erro ao obter taxa Selic: " + e.getMessage());
        }

        return -1; // Se der erro
    }

    public static void main(String[] args) {
        double taxa = obterTaxaSelic();
        System.out.println("Taxa Selic atual: " + taxa);
    }
}