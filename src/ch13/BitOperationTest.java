package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		
		/*
		 * & 각 자리의 두 비트가 같을때만 1
		 * | 각 자리의 두 비트가 0 일 때만 0 
		 * ^ 각 자리의 두 비트가 같으면 0 다르면 1
		 * ~ 각 자리의 비트의 보수
		 */
		int num1 = 5;  					 //0000 0101
		int num2 = 10; 					 //0000 1010
		/*==========================================*/
		System.out.println(num1 & num2); //0000 0000
		System.out.println(num1 | num2); //0000 1111
		System.out.println(num1 ^ num2); //0000 1111
		System.out.println(~num1);		 //1111 1010	
		
		/*
		 * << 연산자는 var * 2ⁿ ex) num1 << 2 는 num * 2²
		 * >> 연산자는 var / 2ⁿ ex) num1 >> 2 는 num / 2²
		 */
		System.out.println(num1 << 1);
		//System.out.println(num1 = num1 << 2);
		System.out.println(num1 <<= 2);
		
		System.out.println(num1 >> 1);
		//System.out.println(num1 = num1 >> 2);
		System.out.println(num1 >>= 2);
	}

}
