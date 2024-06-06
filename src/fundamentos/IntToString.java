package fundamentos;

public class IntToString {

	public static void main(String[] args) {
		
		Integer num = 40;
		String chars = num.toString();
		Integer length = num.toString().length();
		
		System.out.println(chars);
		System.out.println(length);
		
		//convertendo tipo primitivo int
		
		int num2 = 9;
		System.out.println(num2);
		System.out.println(Integer.toString(num2));

	}

}
