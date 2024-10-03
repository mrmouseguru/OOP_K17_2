package buoi4;

public class HinhChuNhat {
	
	//fields / biến
	//trạng thái của đối tượng
	int chieuDai;
	int chieuRong;
	
	//hàm, phương thwusc, hành vi của đối tượng
	HinhChuNhat(){
		
	}
	
	HinhChuNhat(int a, int b){
		chieuDai = a;
		chieuRong = b;
	}
	
	int tinhDienTich() {
		int s = chieuDai * chieuRong;
		return s;
	}
	
	int tinhChuVi() {
		int v = (chieuDai + chieuRong) * 2;
		return v;
		
	}

}
