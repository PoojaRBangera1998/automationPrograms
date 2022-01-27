package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToReadDataFromExternalFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\eclipse\\Collabera\\Collebera1\\demo.txt");
		
		int c = fis.read();
		while(c!=-1)
		{
			System.out.println((char)c);
			c = fis.read();
		}
		
	}

}
