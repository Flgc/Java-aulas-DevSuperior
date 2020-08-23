//@author Professor Nelio alves - Aulão DevSuperior 2020

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String path = "/media/fabio/GoogleDrive/Google Driver/DESENVOLVIMENTO/DevSuperior/Java/in.txt";
		
		FileReader fr = null; 		// ClassClasse padrão para ler stream de dados
		BufferedReader br = null; 	// gerência a memória usada para leitura - otimizando a memória. 
		
		try {
			//Instânciando as variaveis
			fr = new FileReader(path);   //Localiza o caminho definido na variável  		 
			br = new BufferedReader(fr); //Permite a váriavel a leitura dos arquivos
			
			String line = br.readLine(); //Ler o arquivo até a quebra da linha e devolve uma string com essa leitura.
			
			//Lógica para ler até o final do arquivo aberto
			while (line != null){
				System.out.println(line); //Imprime a linha
				line = br.readLine();	  //Ler a próxima linha				
			}		
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage()); // Imprime a exceção da variável "e" 
		}
		finally{	//Bloco que executa o fechamento dos recursos
			try {
				br.close();		
				fr.close();
			}
			catch (IOException e ) {
				e.printStackTrace(); //Imprime na tela todo o erro do stacktrace
			}
		}
	}

}
