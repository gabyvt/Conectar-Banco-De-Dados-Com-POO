package persistencia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PersistenciaPropriedades {
 
	public static void main (String[] args){
		
		Properties propriedades = new Properties();
		propriedades.setProperty("usuario", "joao");
		propriedades.setProperty("senha", "secreta");
		
		try {
			FileOutputStream arquivo = new FileOutputStream  ("config.properties");
			propriedades.store(arquivo, "Configurações de usuario");
			
			arquivo.close();
			System.out.println("Propriedades gravadas com sucesso");
		} catch (IOException e)
		{
			System.out.println("Erro ao gravar propriedades:");
		}
		
	} 

}
