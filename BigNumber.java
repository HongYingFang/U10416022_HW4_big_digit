public class BigNumber {
	//addition method
	public static int[] addition(int[] num1, int[] num2) {
		int carry = 0;
		//set array(result) length = num1.length
		int[] result = new int[num1.length];

		//use for loop to compute num1 + num2 
		for (int i = num1.length - 1; i >= 0; i--) {
			result[i] = num1[i] + num2[i] + carry;
			//use if condition to handle carry situation
			if (result[i] < 10000)
				carry = 0;
			else {
				result[i] = result[i] - 10000;
				carry = 1;
			}
		}
		return result;
	}
	
	//subtraction method 
	public static int[] subtraction(int[] num3, int[] num4) {
		int borrow = 0;
		//set array(resultq) length = num3.length
		int[] result1 = new int[num3.length];

		//use for loop to compute num1 - num2 
		for (int i = num3.length - 1; i >= 0; i--) {
			result1[i] = num3[i] - num4[i] - borrow;
			//use if condition to handle borrow situation
			if (result1[i] >= 0) {
				borrow = 0;

			} else {
				result1[i] = result1[i] + 10000;
				borrow = 1;
			}
		}

		return result1;
	}
}
