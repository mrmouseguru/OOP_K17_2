package buoi4;

public class AppHCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//KHỞI TẠO ĐỐI TƯỢNG HÌNH CHỮ NHẬT
		//từ khóa new Constructor()
		//new HinhChuNhat();
		//nhập từ bàn phím - sv làm
		int inputChieuDai = 10;
		int inputChieuRong = 5;
		int ketQuaDienTich;
		//Biến tham chiếu đối tượng có tên là
		//hcn có kiểu dữ liệu là HinhChuNhat
		HinhChuNhat hcn = null;//RỖNG
		//KHỞI TẠO ĐỐI TƯỢNG HÌNH CHŨ NHẬT TRONG 
		//BỘ NHỚ HEAP
		hcn = new HinhChuNhat(inputChieuDai, inputChieuRong);
		
		//tinh dien tich
		ketQuaDienTich = hcn.tinhDienTich();
		
		
		System.out.println("KQ DT: " + ketQuaDienTich);
		
		
		

	}

}
