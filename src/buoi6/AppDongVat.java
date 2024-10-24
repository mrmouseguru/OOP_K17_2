package buoi6;

import buoi6.p1.Cho;
import buoi6.p2.Bo;
import buoi6.p2.Doi;

public class AppDongVat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bo boRemote = new Bo();
		Bo bo2Remote = new Bo(2, 100, false, 5);
		//bo2Remote.
		bo2Remote.keu();
		
		Cho cho1Remote = new Cho();
		cho1Remote.keu();
		
		Doi doiRemote = new Doi();
		doiRemote.keu();

	}

}
