import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper {
    public static void main(String[] args) {
        try {
            // URL do site a ser extraído
            String url = "https://www.filmeb.com.br/";

            // Conecta-se ao site e obtém o conteúdo da página
            Document document = Jsoup.connect(url).get();

            // Seletor CSS para os elementos que você deseja extrair (altere conforme necessário)
            Elements elements = document.select(".classe-do-elemento - substituir pelo css do site"); // Substitua pela classe correta

            // Nome do arquivo CSV para armazenar os dados
            String csvFileName = "dados.csv";

            // Cria um BufferedWriter para escrever no arquivo CSV
            BufferedWriter writer = new BufferedWriter(new FileWriter(csvFileName));

            // Escreve o cabeçalho do CSV (se necessário)
            writer.write("Coluna1, Coluna2\n");

            // Itera sobre os elementos e escreve os dados no arquivo CSV
            for (Element element : elements) {
                String data1 = element.text(); // Substitua pelo seletor CSS correto
                String data2 = element.text(); // Substitua pelo seletor CSS correto

                // Escreve os dados no arquivo CSV
                writer.write(data1 + ", " + data2 + "\n");
            }

            // Fecha o BufferedWriter
            writer.close();

            System.out.println("Extração concluída com sucesso. Os dados foram salvos em " + csvFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

	
