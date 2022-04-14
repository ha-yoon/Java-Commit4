package loop;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		// 시작값 끝값 증가값까지 입력받아 합 구하기
		
		Scanner scan = new Scanner(System.in);
		
		int hap = 0;
		int num1, num2, num3;
		
		System.out.println("시작값 입력 : ");
		num1 = scan.nextInt();
		
		System.out.println("끝값 입력 : ");
		num2 = scan.nextInt();
		
		System.out.println("증가값 입력 : ");
		num3 = scan.nextInt();
		
		for(int i = num1; i <= num2; i += num3) {
			hap += i;
		}
		
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d\n", 
				num1, num2, num3, hap);
		
		scan.close();
	}

}
