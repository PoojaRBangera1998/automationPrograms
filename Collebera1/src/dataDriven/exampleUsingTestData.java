package dataDriven;

public class exampleUsingTestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ExcelLib.readStringData("Sheet4", 0, 0));// output:- AnvithKateel
		
		System.out.println(ExcelLib.readBoolean("Sheet2", 1, 2));// output:- 2.0
		
		System.out.println(ExcelLib.readNumeric("Sheet1", 0, 4));// output:- false
		
		System.out.println(ExcelLib.readLocalTime("Sheet2", 1, 3));// output:- 2020-01-20T00:00

	}

}
