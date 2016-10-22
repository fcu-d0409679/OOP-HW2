import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String name1;
		
		String name2;
		
		do{

			System.out.println("Enter a string 1: ");
			
			name1=scanner.next();
			
			System.out.println("Enter a string 2: ");
			
			name2=scanner.next();
			
		}while(!(name1.equalsIgnoreCase(name2)));//當滿足while判斷時，則繼續執行
		
		scanner.close();//關閉輸入(沒寫也不會怎樣
		
	}

}
