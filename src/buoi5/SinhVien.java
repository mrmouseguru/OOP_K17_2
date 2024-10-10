package buoi5;

public class SinhVien {
	
	//fields
	private int maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	
	//functions - methods
	public SinhVien(){}
	public SinhVien(int _maSV, String _hoTen, float _diemLT, float _diemTH){
		maSV = _maSV;
		hoTen = _hoTen;
		diemLT = _diemLT;
		diemTH = _diemTH;
	}
	
	public float tinhDiemTrungBinh(){
		return 0;
	}
	
	public String toString() {
		return "Ma so SV: " + maSV 
				+ "\nHo va ten sv: " + hoTen;
	}
	
	// setter
	public void setMaSV(int _maSV) {
		maSV = _maSV;
	}
	
	public void setHoTen(String _hoTen) {
		hoTen = _hoTen;
	}
	//getter va
	public int getMaSV() {
		return maSV;
	}

}
