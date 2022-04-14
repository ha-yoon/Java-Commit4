package condition;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 주민번호를 입력받아 성별 맞추기
		
		char gender = ' '; // 성별
		String ssn = " "; //주민번호 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 주민번호를 입력하세요");
		System.out.println("예 >> 123456-1234567");
		
		ssn = scan.nextLine();
		
		gender = ssn.charAt(7);
		
		
		switch(gender) {
		
		case '1' : 
		case '3' : 
			System.out.println("남자입니다.");
			break;
			
		case '2' : 
		case '4' : 
			System.out.println("여자입니다.");
			break;

			default:
				System.out.println("유효하지 않은 주민번호 입니다.");
		}
		scan.close();
	}

}
