package fundamentos;

import java.util.Scanner;

public class SwitchBrerak {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		String classificacao = "";
		
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10:
			classificacao = "A+";
			break;
			
		case 9:
			classificacao = "A";
			break;
			
		case 8: case 7:
			classificacao = "B";
			break;	
		
		case 6: case 5:
			classificacao = "C";
			break;
			
		case 4: case 3:
			classificacao = "D";
			break;
			
		case 2: case 1:
			classificacao = "E";
			break;
			
		case 0:{
			classificacao = "F";
			System.out.println("Estude pelo amor de deus!");
			break;
			}
		 
		default:
			classificacao = "Não há classificação para essa nota";
		}
		
		System.out.println("Sua Classificacão foi: " + classificacao);

		entrada.close();

	}

}
