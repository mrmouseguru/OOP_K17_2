package buoi5;

public class SinhVien {
	
	//fields
	int maSV;
	String hoTen;
	float diemLT;
	float diemTH;
	
	//functions - methods
	SinhVien(){}
	SinhVien(int _maSV, String _hoTen, float _diemLT, float _diemTH){
		maSV = _maSV;
		hoTen = _hoTen;
		diemLT = _diemLT;
		diemTH = _diemTH;
	}
	
	float tinhDiemTrungBinh(){
		return 0;
	}
	
	public String toString() {
		return "Ma so SV: " + maSV;
	}
	
	//getter va setter

}
