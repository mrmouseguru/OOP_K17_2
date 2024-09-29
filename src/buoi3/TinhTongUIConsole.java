package buoi3;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TinhTongUIConsole {
	
	//biến - variables - fields
	//khai báo biến có tên là keyboard có kiểu dữ liệu là
	//Scanner
	Scanner keyboard = null;
	//Khai báo biến có tên là stdOut có kiểu là PrintWriter
	PrintWriter stdOut = null; //standard  xuất ra màn hình
	PhepTinhTong tinhTong = null;
	
	//functions , hàm, methods , phương thức
	//hàm đặc biệt - constructor
	//hàm khởi tạo đối tượng
	// có tên trùng với tên Class
	//không có kiểu dữ liệu trả về
	TinhTongUIConsole()
	{
		//khởi tạo đối tượng Scanner
		keyboard = new Scanner(System.in);
		
		//khởi tạo đối tượng PrintWriter
		stdOut = new PrintWriter(new OutputStreamWriter(System.out));
		
		
		
	}
	
	void nhap() 
	{
		int soThuNhat, soThuHai, ketQua;
		stdOut.print("Hay nhap vao so thu nhat:");
		stdOut.flush();
		soThuNhat = keyboard.nextInt();
		stdOut.print("Hay nhap vao so thu hai:");
		stdOut.flush();
		soThuHai = keyboard.nextInt();
		//khởi tạo đối tượng PhepTinhTong
		tinhTong = new PhepTinhTong(soThuNhat, soThuHai);
		//gửi thông điệp
		ketQua = tinhTong.sum();
		
		//in kết qua ra màn hình
		stdOut.println("Ket qua tong la: " + ketQua);
		stdOut.flush();
		
		
		
		
	}
	

}
