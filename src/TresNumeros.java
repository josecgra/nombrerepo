import java.util.Scanner;

public class TresNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("introduce num1:");
	    num1=sc.nextInt();
		System.out.println("introduce num2:");
		num2=sc.nextInt();
		System.out.println("introduce num3:");
		num3=sc.nextInt();
	    
		
//		System.out.println(Integer.toString(num1)+Integer.toString(num2)+Integer.toString(num3));
//		System.out.println(num1+num2+num3);
		
		// numero 1 es el mayor de todos
		if (num1>num2 && num1>num3) {
			if (num2>num3)
				System.out.print(Integer.toString(num1)+" "+Integer.toString(num2)+" "+Integer.toString(num3));
			else
				System.out.print(Integer.toString(num1)+" "+Integer.toString(num3)+" "+Integer.toString(num2));
		}
		
		// numero 2 es el mayor de todos
		if (num2>num1 && num2>num3) {
			if (num1>num3)
				System.out.print(Integer.toString(num2)+" "+Integer.toString(num1)+" "+Integer.toString(num3));
			else
				System.out.print(Integer.toString(num2)+" "+Integer.toString(num3)+" "+Integer.toString(num1));
		}
		
		// numero 3 es el mayor de todos
		if (num3>num1 && num3>num2) {
			if (num1>num2)
				System.out.print(Integer.toString(num3)+" "+Integer.toString(num1)+" "+Integer.toString(num2));
			else
				System.out.print(Integer.toString(num3)+" "+Integer.toString(num2)+" "+Integer.toString(num1));
		}
		
	}

}
