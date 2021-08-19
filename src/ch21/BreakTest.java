package ch21;

public class BreakTest {

	public static void main(String[] args) {

		/*
		 * 100을 초과하는 순간의 num값을 얻으려면
		 * break문을 사용하여 반복문 탈출
		 */
		int sum = 0;
		int num;
		for (num = 1; sum <= 100; num++) {
			sum += num;
		}
		System.out.println(sum);
		System.out.println(num);

		sum = 0;
		for (num = 1;; num++) {

			if ((sum += num) > 100)
				break;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
