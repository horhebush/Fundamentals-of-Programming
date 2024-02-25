package Laboratory;
import java.util.Scanner;

public class Method {

	public static void main(String[] args) {

		System.out.print("\n");
		System.out.println("\t Program Methods \t");
		System.out.println("\n");
		System.out.println("\t[A] Display Method A\t");
		System.out.println("\t[B] Display Method B\t");
		System.out.println("\t[C] Display Method C\t");
		System.out.println("\t[X] Program Exit\t");
		System.out.println("\n");

		char x = Default();

		switch(x)
		{
		case 'A': MethodA(); break;
		case 'B': MethodB(); break;
		case 'C': MethodC(); break;
		case 'X': MethodX(); break;
		}

	}

	private static void MethodA() 
	{
		System.out.println("\n\tMethod Display A\n");
		for (int x = 0; x <= 5; x++)
		{
			for (int y = 9; y >= 0; y--)
			{
				System.out.print(y);
				if (y > 0)
				{
					System.out.print(",");
				}
			}
			System.out.print("\n");
		}
	}
	
	private static void MethodB() 
	{
		System.out.println("\n\tMethod Display B\n");
		for (int x = 5; x >= 1; x--)
		{
			System.out.print(x);
			for (int y = 1; y <= x; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void MethodC() 
	{
		System.out.println("\n\tMethod Display C\n");
		for (int x = 5; x >= 1; x--)
		{
			for (int y = 1; y <= x; y++)
			{
				System.out.print(y);
				if (y != x)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	private static void MethodX() 
	{
		System.out.println("\nThank you for using the program methods.");
		System.out.println("Program has been terminated. Good bye!");
	}
	
	private static char Default() 
	{
		char x;

		Scanner select = new Scanner(System.in);
		System.out.print("Enter Preferred Method: ");
		x = select.next().charAt(0);
		
		do 
		{
			if (x != 'A' && x != 'B' && x != 'C' && x != 'X') 
			{
				System.out.println("\nInvalid Input\n");
				System.out.print("Enter Preferred Method: ");
				x = select.next().charAt(0);
			}
		} 
		
		while (x != 'A' && x != 'B' && x != 'C' && x != 'X');
		select.close();
		return x;
	}
}