package dataDriven;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class ToReadDataFromCSVfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("./testResources/testData.csv");

		CSVReader csvreader=new CSVReader(fr);

		
		
//To print only 1st sentence in .csv file
//		String[] data = csvreader.readNext();
//		for(String d:data) {
//			System.out.println(d);
//		}
		

// to print all which is in .csv file
//		List<String[]> allData = csvreader.readAll();
//		for(String [] sarr:allData)
//		for(String d:sarr) {
//			System.out.println(d);
//		}
		
// here username have pooja and jyothi... jyothi is in location 2 so output will b jyothi		
		String[] usernameData = csvreader.readNext();
		System.out.println(usernameData[2]);
		
	}
}
