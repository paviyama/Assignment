import java.util.Scanner;

public class PrimeOrNOt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int number=sc.nextInt();
		int temp =0;
		for(int i=2; i<=number-1; i++){
			if(number%i==0){
				temp=temp+1;
			}
		}
			if(temp==0){
				System.out.println(number+"number is  prime");
			}
			else
			{
				System.out.println(number+"number is not prime");
			}
			
		}
	}
		
		
	


