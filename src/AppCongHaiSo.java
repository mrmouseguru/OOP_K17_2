import java.util.Scanner;

public class AppCongHaiSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soThuNhat;
		int soThuHai;
		int sum, hieu;
		//INPUT
		Scanner input = new Scanner (System.in);
		System.out.print("Nhap so thu nhat:");
		soThuNhat = input.nextInt();
		System.out.print("Nhap so thu hai:");
		soThuHai = input.nextInt();
		
		sum = tinhTong(soThuNhat, soThuHai);
		hieu = tinhHieu(soThuNhat, soThuHai);
		System.out.println("Ket qua tong: " + sum);
		System.out.print("Ket qua hieu: " + hieu);


	}
	
	static int tinhTong(int a, int b) {
				
		return a + b;
		
	}
	
	static int tinhHieu(int a, int b) {
		return a - b;
	}
	
	

}
