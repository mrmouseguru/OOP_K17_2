package buoi3;

public class PhepTinhTong {
	
	//biến - fields
	int soThuNhat;
	int soThuHai;
	
	//functions
	//constructor
	PhepTinhTong(int a, int b)
	{
		soThuNhat = a;
		soThuHai = b;
	}
	
	int sum() {
		return soThuNhat + soThuHai;
	}

}
