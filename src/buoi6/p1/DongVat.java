package buoi6.p1;

public class DongVat {
	
	//field
	int tuoi;
	private float canNang;
	private boolean gioiTinh;
	
	//function
	public DongVat() {
		
	}
	
	public DongVat(int _tuoi, float _canNang, boolean _gioiTinh) {
		tuoi = _tuoi;
		canNang = _canNang;
		gioiTinh = _gioiTinh;
		
	}
	
	public void an() {
		System.out.println("Dong Vat an ...");
	}
	
	
	public void ngu() {
		System.out.println("Dong Vat ngu ...");
	}
	
	public void keu() {
		System.out.println("Dong Vat keu ...");
	}

}
