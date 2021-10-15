
public class ClaseOperadores {

	public static void main(String[] args) {
		
		String cad="textoM";
		int i = 0;
		/*
		 * while (i < cad.length()) {
		 * 
		 * System.out.print(cad.charAt(i)); i = i+1;
		 * 
		 * }
		 */
		
		do {
			System.out.print(cad.charAt(i));
			i =i + 1;
		} while (i < cad.length());
		
	}

}
