package condition;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// 출생연도를 입력받아서 띠 알아보기
		// 쥐, 소, 범, 토끼, 용, 뱀, 말, 양, 원숭이, 닭, 개, 돼지
		
		
		Scanner scan = new Scanner(System.in);
		
		int year;
		
		System.out.println("출생연도 입력 : ");
		System.out.println("예시) 1993 ");
		
		year = scan.nextInt();
		
		//switch문으로 작성
		
		switch(year % 12) {
		
		case 0 :
			System.out.println("원숭이 띠");
			break;
		case 1 :
			System.out.println("닭 띠");
			break;
		case 2 :
			System.out.println("개 띠");
			break;
		case 3 :
			System.out.println("돼지 띠");
			break;
		case 4 :
			System.out.println("쥐 띠");
			break;
		case 5 :
			System.out.println("소 띠");
			break;
		case 6 :
			System.out.println("범 띠");
			break;
		case 7 :
			System.out.println("토끼 띠");
			break;
		case 8 :
			System.out.println("용 띠");
			break;
		case 9 :
			System.out.println("뱀 띠");
			break;
		case 10 :
			System.out.println("말 띠");
			break;
		case 11 :
			System.out.println("양 띠");
			break;
			
		default:
			System.out.println("잘못 입력하셨습니다.");
			
		}
		scan.close();	
	}

}
