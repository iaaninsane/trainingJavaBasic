package fundamentos;

import java.util.Scanner;

public class PegandoEntradaComScanner {

	public static void main(String[] args) {
		
		//instanciando o Scanner
		Scanner entrada = new Scanner(System.in);
		
		//pegando entradas de texto
		System.out.println("digite um texto:");
		String textoDigitado = entrada.nextLine();
		System.out.println("o texto digitado foi:\n" + textoDigitado);
		
		//pegando entradas de inteiros
		System.out.println("digite um núimero:");
		int numeroDigitado = entrada.nextInt();
		System.out.println("o número digitado foi:\n" + numeroDigitado);
		
		entrada.close();
	}

}
