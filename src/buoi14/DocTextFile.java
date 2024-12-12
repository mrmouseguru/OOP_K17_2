package buoi14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DocTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Đối tượng file
		File file = new File("data.txt");
		
		//Đối tượng đọc file
		FileReader fileReader = null;
		BufferedReader bReader = null;
		
		//
		try {
			fileReader = new FileReader(file);
			bReader = new BufferedReader(fileReader);
			String line = null;
			while((line = bReader.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done!!");
		

	}

}
