import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String name1;
		
		String name2;
		
		System.out.println("Enter a string 1: ");
		
		name1=scanner.next();
		
		System.out.println("Enter a string 2: ");
		
		name2=scanner.next();
		
		if(name1.equalsIgnoreCase(name2)){
			
			System.out.println("The two strings are the same.");
			
		}
		
		else{
			
			System.out.println("The two strings are not the same.");
			
		}
		
		
		
		
	}

}
