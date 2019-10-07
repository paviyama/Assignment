
public class Swapping {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println("Before Swapping:" + "X="+x);
		System.out.println("Before Swapping:" +"Y="+y);
		
		//code to swap 'x' and 'y'
		x = x * y; //x now becomes 50
	    y = x / y; //y now becomes 10
		x = x / y;  //x now becomes 5
		
		System.out.println("After Swapping:" + "X="+x);
		System.out.println("After Swapping:"+ "Y=" +y);
	}

}
