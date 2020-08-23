//@author Professor Nelio alves - Aulão DevSuperior 2020

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		String path = "/media/fabio/GoogleDrive/Google Driver/DESENVOLVIMENTO/DevSuperior/Java/in.txt";

		//Instancia uma lista para o produto
		List<Product> list = new ArrayList<Product>();
		
		/* Aplicativo para ler um arquivo txt instânciando objetos do tipo produto
		 Instânciando as variaveis na declaração do bloco try
	 	
 	 	 fr = new FileReader(path);   //Localiza o caminho definido na variável  		 
		 br = new BufferedReader(fr); //Permite a váriavel a leitura dos arquivos		*/
	
		try (BufferedReader br = new BufferedReader(new FileReader(path))){

			String line = br.readLine(); //Ler o arquivo até a quebra da linha e devolve uma string com essa leitura.
			line = br.readLine();        //Ler a próxima linha descarta o cabeçalho do arquivo		

			//Lógica para ler até o final do arquivo aberto
			while (line != null){				
				
				String[] vect = line.split(","); //"Split) -> Separa com base na virgula os textos da linha e armazena nos vetores

				String  name  = vect[0];
				Double  price = Double.parseDouble(vect[1]); // Double.parseDouble() -> Converte o conteudo em string para double
				Integer qte   = Integer.parseInt(vect[2]);	 // Integer.parseInt() -> Converte o conteudo em String para inteiro 	
				
				//Instancia o produto
				Product prod = new Product(name, price, qte);
				list.add(prod); //Insere na lista
	
				line = br.readLine(); //Ler a próxima linha descarta o cabeçalho do arquivo				
			}
			//Imprime na tela (Útilizando o método toString() na classe Product
			System.out.println("PRODUCTS:");
			for (Product p : list) {
				System.out.println(p);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage()); // Imprime a exceção da variável "e" 
		}
	}
}
