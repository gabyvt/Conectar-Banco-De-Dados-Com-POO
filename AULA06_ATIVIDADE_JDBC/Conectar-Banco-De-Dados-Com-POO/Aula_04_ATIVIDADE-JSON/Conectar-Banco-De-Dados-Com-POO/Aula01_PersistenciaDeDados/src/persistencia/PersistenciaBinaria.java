package persistencia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistenciaBinaria {
	
	public static void main (String[] args) {
		
		Pessoa pessoa = new Pessoa ("Joao", 30);
				
		try {
			
			FileOutputStream arquivo = new FileOutputStream ("dados.bin");
			ObjectOutputStream escritor = new ObjectOutputStream(arquivo);
			
			escritor.writeObject(pessoa);				
			
			escritor.close();
			arquivo.close();
			System.out.println("Objeto Gravado Com Sucesso");						
		} catch (IOException e) {
			System.err.println("Erro ao gravar objeto: " + e.getMessage());
			
		}						
	}	
}

class Pessoa implements Serializable {
	String nome;
	int idade;
	public Pessoa (String nome, int idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
}
