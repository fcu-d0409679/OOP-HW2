import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int integer;
		
		float floatnum;
		
		String name;
		
		System.out.println("Enter a integer: ");
		
		integer=scanner.nextInt();
		
		System.out.println("Enter a float point number: ");
		
		floatnum=scanner.nextFloat();
		
		System.out.println("Enter a you name: ");
		
		name=scanner.next();//nextLine() ���o�ϥΪ̿�J���r��(�]�t�ťզr���B�ť���BTab) �A next() (���]�t�ťզr���B�ť���BTab)
		
		System.out.printf("Hi %s, the multiplication of %d and %f is %e.",name,integer,floatnum,integer*floatnum );
		
		scanner.close();//������J(�S�g�]���|���
		
		

	}

}
