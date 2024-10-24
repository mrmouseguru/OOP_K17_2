package buoi6.p2;
import buoi6.p1.DongVat;
/**
 * Write a description of class Bo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bo extends DongVat
{
    
	private float khoiLuongSua;
    
    //
    public Bo(){}
    
    public Bo(int _tuoi, float _canNang, boolean _gioiTinh, float _khoiLuongSua) {
    	super(_tuoi, _canNang, _gioiTinh);//gọi hàm khởi tạo của class cha
    	khoiLuongSua = _khoiLuongSua;
    }
    
    public String toString() {
    	return "tuoi: " + tuoi;
    }
    
    public void nhaiLai() {
    	System.out.println("Bo nhai lai ...");
    }
    
    @Override
    public void keu() {
    	//super.keu();//gọi hàm keu() của class cha
    	System.out.println("Bo keu Um bo...");
    }
}
