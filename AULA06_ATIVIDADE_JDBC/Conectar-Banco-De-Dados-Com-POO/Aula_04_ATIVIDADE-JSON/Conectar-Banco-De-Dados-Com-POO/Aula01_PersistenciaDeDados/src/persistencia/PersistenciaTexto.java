package persistencia;

import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaTexto {
	


		public static void main(String[] args)
		{
			String conteudo = "Este e um exemplo";
			
			
			try {
				
				FileWriter escritor = new FileWriter("arquivo.txt");
				escritor.write(conteudo);
				escritor.close();
				System.out.println("Dados gravados");
			}
			
			catch (IOException e) {
				
				System.err.println("Erro ao escrever arquivo"+ e.getMessage());
			}
			}
			
			
		}




