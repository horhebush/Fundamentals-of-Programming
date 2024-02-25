package Laboratory;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] z = new int[10];

		System.out.println("\n\tFind the Greatest and Lowest number using Array");
		System.out.println();

		for (int i = 0; i < 1; i++) 
		{
			System.out.print("Enter 1st Number: ");
			z[i] = input.nextInt();
		}

		for (int i = 1; i < 2; i++) 
		{
			System.out.print("Enter 2nd Number: ");
			z[i] = input.nextInt();
		}

		for (int i = 2; i < 3; i++) 
		{
			System.out.print("Enter 3rd Number: ");
			z[i] = input.nextInt();
		}

		for (int i = 3; i < 10; i++) 
		{
			System.out.print("Enter " + (i + 1) + "th Number: ");
			z[i] = input.nextInt();
		}

		input.close();

		int max = z[0];
		int min = z[0];

		for (int value = 0; value < 10; value++) 
		{
			if (z[value] > max) 
			{
				max = z[value];
			}
			if (z[value] < min) 
			{
				min = z[value];
			}
		}

		System.out.println();
		System.out.println("Greatest Value: " + max);
		System.out.print("Lowest Value: " + min);

	}
}