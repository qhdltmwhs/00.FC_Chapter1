package ch21;

public class ContinueTest {

	public static void main(String[] args) {

		/*
		 * 3의 배수가 아니면 이후 코드를 실행하지 않고 반복문을 이어간다.
		 * 3의 배수일때만 출력을 한다(3, 6, 9, ...99)
		 */
		int num;
		
		for (num = 1; num <= 100; num++) {
			if ((num % 3) != 0) continue;
			System.out.println(num);
		}

	}

}
