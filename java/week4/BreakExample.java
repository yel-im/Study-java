package week4;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다");
		
		while(true) {
			System.out.println("> >");
			String text = scan.nextLine();
			if(text.contentEquals("exit"))
				break;
		}
		
		System.out.println("종료합니다");
		scan.close();
	}

}
