package persistencia;

import java.io.FileWriter;
import java.io.IOException;


public class PersistenciaCSV {
	
		
		public static void main (String[] args) {
			
			Pessoa pessoa = new Pessoa ("Joao", 30);
			
			try {
				FileWriter writer = new FileWriter("arquivo.csv");
				writer.append("nome,idade\n");
				writer.append(pessoa.nome + "," + pessoa.idade + "\n");
	            writer.close();

	            System.out.println("Objeto Gravado Com Sucesso em CSV");
			} catch (IOException e) {
				
				System.out.println("Erro ao criar arquivo ");
			}
				
			}
			
			
			

}
