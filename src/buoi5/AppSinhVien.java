package buoi5;

import java.util.Scanner;

public class AppSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv1Remote = new SinhVien(1111, "Le Van Teo", 5.5f, 6.5f);
		SinhVien sv2Remote = new SinhVien(2222, "Nguyen Thi Be", 9f, 9f);
		Scanner input = new Scanner(System.in);
		
		System.out.println(sv1Remote);
		System.out.println(sv2Remote);
		
		SinhVien sv3Remote = new SinhVien();
		//nhap thong tin tu ban phim cho sv3
		System.out.print("Nhap ma so sv3:");
		sv3Remote.maSV = input.nextInt();//3333Enter
		input.nextLine();//Enter
		System.out.print("Nhap ten sv3:");
		sv3Remote.hoTen = input.nextLine();
		System.out.print("Nhap diem ly thuyet sv3:");
		sv3Remote.diemLT = input.nextFloat();
		System.out.print("Nhap diem thuc hanh sv3:");
		sv3Remote.diemTH = input.nextFloat();
		
		System.out.println(sv3Remote);
		
		//buoc 2
		//new SinhVien(1111, "Le Van Teo", 5.5f, 6.5f);
		//new SinhVien(2222, "Nguyen Thi Be", 9f, 9f);

	}

}
