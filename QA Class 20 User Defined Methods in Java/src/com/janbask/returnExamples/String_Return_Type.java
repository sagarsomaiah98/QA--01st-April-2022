package com.janbask.returnExamples;

public class String_Return_Type {
	
	
	public  String String_function(String name) {
		
		
		
		String place="USA";
		String job="Tester";
		String gender=" male";
		
		String color=" Red";
		
		
		color= color+place;// RedUSA
		job= place+gender;// USAmale
		place= job+color; // TesterRedUSA
		
		place =name+color;// Welcome ToRedUSA
		
		
				
		
		return place;
		
      
	
		
	}

	public static void main(String[] args) {
		
		String_Return_Type s = new String_Return_Type();
		System.out.println(s.String_function("Welcome To"));
		     
		//W-0 E-1 L-2 C-3 
		//System.out.println(String_function("WELCOME TO "));
		
		//String request= "Leave Request (2021-04-20 to 2021-04-22) Manali Kulkarni";
		
		//String start_date=request.substring(15,25);
		//System.out.println(start_date);
		
		String input=s.String_function("Welcome To");
		
		System.out.println(input.substring(2, 7));
		
		
		
		

	}

}
