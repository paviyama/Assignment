import java.util.Scanner;

public class LargestOfThree {
	
	public static void main(String[] args) {
		int x, y, z;
		System.out.println("Enter three integers");
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
	if(x>y && x>z)
		System.out.println("X is greater");
	else if(y>z)
		System.out.println("Y is greater");
	else if(z>x && z>y)
	System.out.println("Z is greater");
	
		
			
		
		
		
	}

}
