package buoi6;

import buoi6.p1.Cho;
import buoi6.p1.DongVat;
import buoi6.p2.Bo;
import buoi6.p2.Doi;

public class AppDongVat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bo boRemote = new Bo();
		Bo bo2Remote = new Bo(2, 100, false, 5);
		   //Bo            Bo
		//bo2Remote.
		//Biến tham chiếu (Remote) có tên là 
		//bo2Remote (kiểu là Bo - class con)
		//gửi thông điệp đến (gọi hàm)
		//của đối tượng Bò kiểu class Bo (class con)
		//bo2Remote.keu();
		
		Cho cho1Remote = new Cho();
		//  Cho              //Cho
		//cho1Remote.keu();
		
		Doi doiRemote = new Doi();
		/// Doi         //Doi
		//doiRemote.keu();
		
		//ĐA HÌNH
		DongVat dvRemote = null;
		dvRemote = new Bo();
		dvRemote.keu();
		///     DongVat    Bo
		dvRemote = new Cho();
		dvRemote.keu();
		
		dvRemote = new Doi();
		dvRemote.keu();

	}

}
