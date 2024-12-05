package buoi13;

public class Account {
	
	//fields
	//instance variables
	int a;
	int b;
	
	//functions - method
	public void setData(int a, int b) {
		/*this = acc*/this.a = a;// biến a bên trái dấu = là instance variable 
		           //biến đối tượng trong Heap
					//a bên phải là local variable
					// biến thuộc hàm setData trong stack
		//khi chạy từ khóa this sẽ được thay thế 
		//bằng Biến tham chiếu đối tượng acc
		this.b = b;
	}
	
	public void showData() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
