package buoi13;

public class VitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("So doi tuong vit: " + Vit.getCount());;
		
		Vit vit1 = new Vit();
		
		//keu() của đối tượng vịt phải
		//thông qua biến tham chiếu object (Remote)
		vit1.keu();
		
	
		
		System.out.println("So doi tuong vit: " + Vit.getCount());;
		Vit vit2 = new Vit();
		System.out.println("So doi tuong vit: " + Vit.getCount());;

	}

}
