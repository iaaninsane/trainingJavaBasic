package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário
		
		//Tipos numéricos interios
		byte anosDeEmpresa=23; //1 byte
		short numeroDevoos =542; //2 bytes
		int id = 378_523; //4 bytes
		long pontosAcumulados = 3_698_521_447L; //8 bytes
		
		//Tipos Numéricos Reais
		float salario = 75_364.32F; // 4bytes
		double vendasTotal = 785_234_367.6; //8bytes
		
		//Tipo booleano
		boolean ativo = true; //1 bit
		
		//Tipo caractere
		char status = 'b'; //1 byte
		
		System.out.println("tipos numéricos: \n" + "bite: " + anosDeEmpresa + "\n" + "short: " + numeroDevoos);
	}

}
