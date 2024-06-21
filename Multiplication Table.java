package Laboratory;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Number of Row(s): ");
		int Row = scn.nextInt();
		System.out.print("Enter the Number of Column(s): ");
		int Col = scn.nextInt();
		scn.close();

		for (int x = 1; x <= Row; x++) {
			for (int y = 1; y <= Col; y++) 
				{
				System.out.print("\t" + x * y);
				}
			System.out.println(" ");
			System.out.println();
		}
	}
}
