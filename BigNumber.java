public class BigNumber {
  //addition method
	public static int[] addition(int[] num1, int[] num2) {
		int carry = 0;
		//set array(result) length = num1.length
		int[] result = new int[num1.length];

		//use for loop to compute num1 plus num2 
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























}
