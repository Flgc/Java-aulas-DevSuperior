import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Utilizando injeção de dependência utilizando polimorfismo
		   utilizando uma stream de um arquivo */
		
		File file = new File("/media/fabio/GoogleDrive/Google Driver/DESENVOLVIMENTO/Java_Udemy/Aulas/in.txt");
		
		Scanner sc = null; // Instaciamos a variável Scanner
		try {
			
			sc = new Scanner(file);

			//Lógica pára lêr o arquivo linha alinha
			while (sc.hasNextLine()) {  		//Essa função retorna verdadeiro se não chegou no fim do arquivo
				String line = sc.nextLine(); 	//Ler a linha atual e possiciona o cursor na próxima linha
				System.out.println(line);		//Imprime a linha
				
				/*System.out.println(sc.nextLine())   //--> Pode ser feito dessa forma para simplificar o código*/
			}			
		}
		catch (IOException e) {
			System.out.println(e.getMessage()); // Imprime a exceção da variável "e" 
		}
		finally{	//Bloco que executa o fechamento dos recursos
			if (sc != null) {	//Verifica se a variável "sc" não está nula para evitar
				sc.close();		//  outra exceção. Error de ponteiro! >>>No poiter exeption<<<
			}
		}
	}

}
