package buoi14;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		Scanner keyboardInput = null;
		try {
			str = keyboardInput.nextLine();
			System.out.println("Sau dong nextLine()");
		}
		catch(NullPointerException nullEx) {
			System.out.println("Co ngoai le xay ra !!!");
		}
		System.out.println(str);
	}

}
