package dataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToWriteDataToExternalFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\eclipse\\Collabera\\Collebera1\\Doc.txt");
		//here Doc.txt can create here only no need of going to the folder and create
		
		fos.write('a');
		fos.write('r');
		fos.write('j');
		

	}

}
