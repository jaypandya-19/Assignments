/**
 * 
Assignment: Write a program to perform the following tasks:
1. Count the total number of words in the sentence.
2. Print the sentence words in reverse order.
3. Convert the first character of each word to uppercase and print original sentence

String sentence = "Java programming is fun and challenging";

Assignment: Write a program to search for all occurrences of a “Java” word in the paragraph and print their
indexes.
1. Divide into multiple words
2. Find total number of occurrences
3. Print count and Indexes of the word

String paragraph = "Java is a popular programming language. Java is used for web
development, mobile applications, and more.";
Assignment: Write a program to print * in triangle pattern
1. If I will pass int rows = 5 then it should print triangle with 5 Rows
*
**
***
****
******/

package assignments;

public class Assignment15_17_StringOperation {

	public static void main(String[] args) {

		String sentence = "Java programming is fun and challenging";
		// 1. Count the total number of words in the sentence.
		String[] word = sentence.split(" ");

		System.out.println("Count the total number of words in the sentence: " + word.length);

		// 2. Print the sentence words in reverse order.
		String reverse = "";
		for (int i = word.length - 1; i >= 0; i--) {
			reverse = reverse + word[i] + " ";
		}
		System.out.println("The Reverse Word String is: " + reverse);
		// 3. Convert the first character of each word to uppercase and print original
//		String upperChar = "";
//		for (int i = 0; i < word.length - 1; i++) {
//			String convertedWord = "";
//			for (int j = 0; j < word[i].length(); j++) {
//				if (j == 0) {
//					convertedWord = convertedWord + word[i].toUpperCase();
//				} else {
//					convertedWord = convertedWord + word[i].toLowerCase();
//				}
//				System.out.println("The UpperCase Word String is: " + convertedWord);
//			}
//			upperChar = upperChar + convertedWord;
//		}
//		System.out.println("The UpperCase Word String is: " + upperChar);

		// Assignment:17 If I will pass int rows = 5 then it should print triangle with 5 Rows
		int n = 5;
//			for (int i = n; i >= 0; i--)
//			{
//			for (int j = 0; j < i; j++) {
////				if(j<=i)
//					System.out.print(" ");
////				else System.out.println(" ");
//			}
//			System.out.println("*");
		// outer loop to handle rows
        for (int i = n; i >= 1; i--) {

            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
		}
	}

}
