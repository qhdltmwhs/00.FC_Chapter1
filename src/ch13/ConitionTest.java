package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");
		
		System.out.println("입력1:");
		int num1 = scanner.nextInt();
		
		System.out.println("입력2:");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2)? num1 : num2;
		System.out.println("result: " + max);
		
		scanner.close();
		
	}

}
