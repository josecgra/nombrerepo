
public class Cuadrado {

	public static void main(String[] args) {
		
		// 3 x 3 con #
		
		System.out.println("3 x 3");
		
		//System.out.print("#");
		//System.out.println();
		
	
		
		for (int k=0; k < 3; k++) {
			for (int i=0; i < 3; i++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		// 4 x 4 con #
		System.out.println("4 x 4");
		int contador = 0;
		while (contador < 4) {
			for (int i=0; i < 4; i++) {
				System.out.print("#");
			}
			System.out.println();
			contador++;
		}
		
				
		System.out.println();
		
		
		// 10 x 10 con @		
		System.out.println("10 x 10");
		int j = 0;
		do {
			for (int i=0; i <= 9; i++) {
				System.out.print("@");
			}
			System.out.println();
			j++;
		} while(j <= 9);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
