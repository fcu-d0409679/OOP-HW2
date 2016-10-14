import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a integer: ");
		
		num=scanner.nextInt();
		
		if(num%2==1){
			
			System.out.println("The input integer is Odd Number.");
			
		}
		
		else{
			
			System.out.println("The input integer is Even Number.");
						
		}
		
		scanner.close();
		
	}

}
