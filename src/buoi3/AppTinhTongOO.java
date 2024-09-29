package buoi3;

public class AppTinhTongOO {
	
	public static void main(String[] args) {
		//Khai báo biến THAM CHIẾU ĐỐI TƯỢNG có tên là tinhCongUI
		//có kiểu dữ liệu TinhTongUIConsole
		TinhTongUIConsole tinhTongUI = null;
		//khởi tạo đối tượng TinhTongUIConsole
		    //từ khóa new - Hàm khởi tạo đói tượng 
		                  //constructor
		tinhTongUI = new TinhTongUIConsole();
		
		//gửi thông điệp
		
		tinhTongUI.nhap();
		
	}

}
