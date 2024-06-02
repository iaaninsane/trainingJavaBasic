package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		//pegando uma posição específica da string
		System.out.println("pegando uma posição específica da string".charAt(0));
		
		//concatenando string
		String s = "Te Vejo Por Aí ";
		String [] diaSemana = {"segunda","terça","quarta","quinta","sexta","sábado","domingo"};
		System.out.println(s.concat("na terça"));
		System.out.println(s + "na quarta");
		System.out.println(s + diaSemana[0]);
		
		//Transformando em maiúscula
		System.out.println(s.toUpperCase());
		
		//Transformando em minúscula
		System.out.println(s.toLowerCase());
		
		//testando se string começa ou termina com uma substring ou conjunto de caracteres
		System.out.println(s.startsWith("Te"));// retorno igual true
		System.out.println(s.endsWith("te"));// retorno igual false
		
		//formatacao
		System.out.printf("%s %s, %s, %s, %s, %s, %s, %s\n", s,diaSemana[0],diaSemana[1],diaSemana[2],diaSemana[3],diaSemana[4], diaSemana[5],diaSemana[6]);
		
		//tamanho da string
		System.out.println(s.length());
		

	}

}
