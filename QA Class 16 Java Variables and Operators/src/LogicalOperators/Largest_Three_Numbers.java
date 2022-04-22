package LogicalOperators;

public class Largest_Three_Numbers {

	public static void main(String[] args) {
		
		int a=50;
		int b=30;
		int c=70;
		
		if(a>b) //true
		{
			if(a>c)//false
				System.out.println("a is greatest");
			else
				System.out.println("c is greatest ");
			
		}
		else
		{
			if(b>c)//true
				System.out.println("b is greatest");
			else
				
				System.out.println("c is greatest");
		}

	}

}
