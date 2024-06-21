package Laboratory;

import java.awt.Toolkit;
import java.util.Scanner;
public class LoginCredentials {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String username[]=new String[3];
		String password[]= new String[3];
		
		for(int x = 0; x <= 2; x++) 
		{
			System.out.print("Enter Username: ");
			username[x] = input.nextLine();
			System.out.print("Enter Password: ");
			password[x]= input.nextLine();
			
			String convert1 = username[x].toUpperCase();
			String convert2 = password[x].toLowerCase();
			
			System.out.println("\nUsername: " + convert1 );
			System.out.println("Password: " + convert2);
			
			boolean result1 = convert1.equals("FUNDAMENTALS");
			boolean result2 = convert2.equals("admin");
			
			if(result1 == true && result2 == true) 
			{
				
					System.out.println("\n\tLog-in success!");
					break;
			}
			else 
			{
				System.out.println("\n\tInvalid Input!");
				System.out.println();
			}
					
			if (x == 2) 
			{	
				System.out.println("\n\tYou are terminated!");
				Toolkit.getDefaultToolkit().beep();
			}
		}
		input.close();
	}

}

