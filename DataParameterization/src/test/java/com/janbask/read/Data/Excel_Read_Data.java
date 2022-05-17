package com.janbask.read.Data;

public class Excel_Read_Data {

	

	public static void main(String[] args) {
		
		Xls_Reader xls= new Xls_Reader("S:\\JANBASK\\JANBASK_WORKSPACE\\QA- 01st April 2022\\DataParameterization\\src\\main\\java\\TestData\\TESTSUITE.xlsx");

		int rowCount=xls.getRowCount("GMAIL");
		System.out.println(rowCount);
		
	
		for(int i=0;i<=rowCount;i++)
		{
	String value1=xls.getCellData("GMAIL", "TCID", i);
	String value2= xls.getCellData("GMAIL", "TESTCASE", i);
	String value3= xls.getCellData("GMAIL", "STATUS", i);
	
	System.out.println(value1+" | "+value2+" | "+value3);
	}
	}

}
