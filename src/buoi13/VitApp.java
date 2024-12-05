package buoi13;

public class VitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("So doi tuong vit: " + Vit.getCount());;
		Vit vit3 = null;
		Vit vit1 = new Vit();
		vit3 = vit1;// 1 đối tượng vịt được điểu khiển bởi
					//02 biến tham chiếu đối tượng
		vit1 = null;//còn remote vit3 điều khiển object vit
		//keu() của đối tượng vịt phải
		//thông qua biến tham chiếu object (Remote)
		vit3.keu();
		vit3 = null;//không còn remote nào điều khiển object
				
		System.out.println("So doi tuong vit: " + Vit.getCount());;
		Vit vit2 = new Vit();
		System.out.println("So doi tuong vit: " + Vit.getCount());;

	}

}
