import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String path = "/media/fabio/GoogleDrive/Google Driver/DESENVOLVIMENTO/Java_Udemy/Aulas/in.txt";

		/*Instânciando as variaveis na declaração do bloco try
	 	
	 	 	fr = new FileReader(path);   //Localiza o caminho definido na variável  		 
			br = new BufferedReader(fr); //Permite a váriavel a leitura dos arquivos
		*/
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
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
	}

}
