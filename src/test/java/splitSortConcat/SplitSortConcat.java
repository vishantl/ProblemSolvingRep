package splitSortConcat;

import java.util.Arrays;

public class SplitSortConcat {
	
	public static Integer[] newInput;
	public static String outputString = "";

	public static void main(String[] args) {
		
		String command = "1+5+4+9+2+3";
		//String delim = "+";
		String[] numbers = command.split("\\+");
		int counter = numbers.length;
		System.out.println(counter);
		System.out.println(Arrays.toString(numbers));
		/* I thought the characters will have to be converted to numbers first in order to sort.
		 * But, it is not required as such. See from //Arrays.sort(numbers)// below
		 * for (int i=0;i<counter;i++) {
		 * 
		 * int num = Integer.parseInt(numbers[i]); newInput = new Integer[counter];
		 * newInput[i] = num; System.out.print((newInput[i]).toString());
		 * System.out.print("\t"); }
		 */
		
		Arrays.sort(numbers);
		 for (int i=0;i<counter;i++) {
			 System.out.println(numbers[i]);
		 }
		
		 for (int j=0;j<counter-1;j++) 
		 { 
			 numbers[j] = numbers[j] + "+"; 
		 }
 
		/* String prefix = "";
		 String delimiter = "+";
		 for(int k=0;k<counter;k++) {
			 
		 outputString+= prefix+ numbers[k];
		 prefix = delimiter;
		 
		 }*/
		 
		 for(int k=0;k<counter;k++) {
		 outputString= outputString+ numbers[k];
		 }
		 System.out.println(outputString);
		 
	}
}