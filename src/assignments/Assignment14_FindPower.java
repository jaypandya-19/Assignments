/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e., x n).

Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
*/

package assignments;

public class Assignment14_FindPower {
	/**
	 * Below Method is created for find the power of given number.
	 * 
	 * @param first this is for a number whose power needs to find
	 * @param power this is a value of power
	 */
	public void pow(double first, int power) {
		// firstNumber is store the value of first
		double firstNumber = first;

		// powerNumber is store the value of power
		int powerNumber = power;

		// answer is use for store the answer of givan number
		double answer = 1;

		// Below condition is use for find power of +ve power
		if (powerNumber >= 0) {
			for (int i = 0; i < powerNumber; i++) {
				answer = answer * firstNumber;
			}
			System.out.format("Answer is : %.5f", answer);
		}
		// Below condition is use for find power of -ve power
		else if (powerNumber < 0) {
			powerNumber = powerNumber * (-1);
			for (int i = 0; i < powerNumber; i++) {
				answer = answer * firstNumber;
			}
			answer = 1 / answer;
			System.out.format("Answer is of : %.5f", answer);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Assignment14_FindPower power = new Assignment14_FindPower();
		power.pow(2.00000, 10);
		power.pow(2.10000, 3);
		power.pow(2.00000, -2);
	}

}
