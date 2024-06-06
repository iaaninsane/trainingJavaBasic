package fundamentos;

public class ForEForEach {

	public static void main(String[] args) {
		
		String[] diasDaSemana = {"domingo","segunda","terça","quarta","quinta","sexta","sábado"};
		
		System.out.println("for \"clássico\"");
		
		for (int i = 0; i < diasDaSemana.length; i++) {
			System.out.println(diasDaSemana[i]);
		}
		
		System.out.println("for \"foreach\"");
		
		for (String dia : diasDaSemana) {
			
			System.out.println(dia);
		}
	}

}
