package LogicalOperators;

public class Biggest_four_Numbers {

	public static void main(String[] args) {
		
		int a=0, b=8,c=10,d=2;
		
		if(a>b & a>c & a>c & a>d) //  false
			
			System.out.println("a is bigger");
		
		else if(b>a & b>c & b>d) // true & false & true = false
		
			System.out.println("b is bigger");
		
		else if(c>a & c>b & c>d) //  true
		
			System.out.println("c is bigger");
		
		else 
		
			System.out.println("d is bigger");

	}

}
