package buoi6.p2;

import buoi6.p1.DongVat;

public class Doi extends DongVat{
	
	public Doi() {
		
	}
	
	public String toString() {
		return "gioi tinh: " + gioiTinh;
	}
	
	public void bay() {
		System.out.println("Doi bay ....");
	}
	
	@Override
	public void keu() {
		System.out.println("Doi keu rit rit ...");
	}

}
