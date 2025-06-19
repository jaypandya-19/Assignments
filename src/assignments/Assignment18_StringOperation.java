/**
Assignment 18 (String Operations)
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include
letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.*/
package assignments;

public class Assignment18_StringOperation {
/**
 * Below Method is created for find the string is Palindrom or not.
 * @input is use as a argument get from the user.
 * */
	public void palindrom(String input) {
		//givenInput is a variable to store the string value given by the user.
		String givenInput = input;
		
		//sentance is a variable which store the string with on a-z,  A-Z and 0 to 9
		String sentance = givenInput.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println("The String only char is: " + sentance);
		
		// rev is a variable which store the reverse value of given string 
		String rev = "";
		for (int i = sentance.length() - 1; i >= 0; i--) {
			rev = rev + sentance.charAt(i);
		}
//		System.out.println("The Reverse String only char is: " + rev);
		
		// Below if condition check that the input string and reverse strings are match with each other or not 
		if (rev.equals(sentance)) {
			System.out.println("The String " + "'"+givenInput + "'"+ " is a Palindrom");
		} else {
			System.out.println("The String " + "'"+givenInput + "'"+" is not a Palindrom");
		}
	}

	public static void main(String[] args) {
		Assignment18_StringOperation pel = new Assignment18_StringOperation();
		pel.palindrom("A man, a plan, a canal: Panama");
		pel.palindrom("raceacar");
//		String sent = "Jay0; 0yaj";
		
	}
}
