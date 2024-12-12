package buoi14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		Scanner keyboardInput = null;
		keyboardInput = new Scanner(System.in);
		int number = 0;
		try {
			str = keyboardInput.nextLine();
			//System.out.println("Sau dong nextLine()");
			number = keyboardInput.nextInt();
		}
		catch(NullPointerException nullEx) {
			System.out.println("Co ngoai le xay ra !!!");
		}
		catch(InputMismatchException inpuEx) {
			System.out.
			println("Co ngoai le xay ra InptMismatch!!!: " + 
			inpuEx.getMessage());
		}
		System.out.println(str + " number: " + number);
	}

}
