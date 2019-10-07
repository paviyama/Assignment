
public class SwapUsingTemp {
	public static void main(String[] args) {
		
	
	int x=10;
	int y=20;
	System.out.println("Before Swapping");
	System.out.println("the value of x is" +x);
	System.out.println("The value of y is" +y);
	
	swap(x, y);
	}
	private static void swap(int x, int y){
		int temp = x;
		x=y;
		y=temp;
		
		System.out.println("after Swapping");
		System.out.println("the value of x is" +x);
		System.out.println("The value of y is" +y);
		
		
		
	
	
	
	

	}

}
