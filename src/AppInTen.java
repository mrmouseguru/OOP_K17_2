import java.util.Scanner;
public class AppInTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inTen();

	}
	
	static void inTen() {
		//khai báo biến có tên là keyboardInput 
		//có kiểu dữ liệu là Scanner- là kiểu tham chiếu đối tượng
		Scanner keyboardInput = null;
		String name = null;
		//khởi tạo đối tượng
		keyboardInput = new Scanner(System.in);
		//nhập chuỗi tên vào từ bàn phím
		System.out.print("Input the name:");
		name = keyboardInput.nextLine();//"Teo"
		
		//int a;//biến có tên a có kiểu int
		//a = 5;
		//XUẤT
		System.out.print("Hello " + name);
	}

}
