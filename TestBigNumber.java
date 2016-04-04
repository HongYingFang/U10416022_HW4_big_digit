//U10416022
public class TestBigNumber {
	public static void main(String[] args) {

		//set the number >> array num1 and array num2
		int[] num1 = { 1999, 9999, 9999, 9999 };
		int[] num2 = { 1111, 1111, 1111, 1111 };
		//call addition method
		int[] result = BigNumber.addition(num1, num2);

		//set the number >> array num3 and array num4
		int[] num3 = { 1999, 9999, 9999, 8899 };
		int[] num4 = { 1111, 1111, 1111, 9911 };
		//call subtraction method
		int[] result1 = BigNumber.subtraction(num3, num4);
		
		//print out the result(+)
		System.out.print("1999999999999999+1111111111111111 =");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
		
		System.out.println("");
		
		//print out the result(-)
		System.out.print("1999999999998899-1111111111119911 =");
		for (int i = 0; i < result1.length; i++) {
			System.out.print(result1[i]);

		}

	}
}
