package fundamentos;

public class DesafioForSemValorNumerico {
	
	public static void main(String[] args) {
		
		String valor = "#";
		
		System.out.println("for com valor numérico");
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.println(valor);
			valor+="#";
		}
		
		System.out.println("for sem valor numérico");
		
		for(String cerquilha="#"; !cerquilha.equals("#######"); cerquilha+="#") {
			
			System.out.println(cerquilha);
		}
	}
}
