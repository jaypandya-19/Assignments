package assignments;

public class Assignment11_diamond {

	public static void main(String[] args) {

		int i, j, n = 6;
		// outer loop to handle Upper Parts
		for (i = 1; i <= n; i++) {

			// inner loop to print space
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// inner loop to print star
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			// print new line for each row
			System.out.println();
		}
		
		// outer loop to handle lower part
        for (i = n-1; i >= 1; i--) {
            
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
	}
}
