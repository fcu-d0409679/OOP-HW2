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
		
		name=scanner.next();//nextLine() 取得使用者輸入的字串(包含空白字元、空白鍵、Tab) ， next() (不包含空白字元、空白鍵、Tab)
		
		System.out.printf("Hi %s, the multiplication of %d and %f is %e.",name,integer,floatnum,integer*floatnum );
		
		scanner.close();//關閉輸入(沒寫也不會怎樣
		
		

	}

}
