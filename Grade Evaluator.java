package Laboratory;

import java.util.Scanner;

public class GradeEvaluator {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Final Grade: ");
		num = sc.nextInt();
		sc.close();
		
		if (num >= 98 && num <= 100)
		{
		System.out.println("Equivalent: A+");
		System.out.println("Remarks: PASSED");
		}
		
		else if (num >= 95 && num <= 97)
		{
		System.out.println("Equivalent: A");
		System.out.println("Remarks: PASSED");
		}
		
		else if (num >= 92 && num <= 94)
		{
		System.out.println("Equivalent: A-");
		System.out.println("Remarks: PASSED");
		}
		
		else if (num >= 89 && num <= 91)
		{
		System.out.println("Equivalent: B+");
		System.out.println("Remarks: PASSED");
		}
		
		else if (num >= 86 && num <= 88)
		{
		System.out.println("Equivalent: B");
		System.out.println("Remarks: PASSED");
		}
		
		else if (num >= 83 && num <= 85)
		{
		System.out.println("Equivalent: B-");
		System.out.println("Remarks: PASSED");
		}
		
		else if (num >= 80 && num <= 82)
		{
		System.out.println("Equivalent: C+");
		System.out.println("Remarks: PASSED");
		}
		
		else if (num >= 77 && num <= 79)
		{
		System.out.println("Equivalent: C");
		System.out.println("Remarks: PASSED");
		}

		else if (num >= 75 && num <= 76)
		{
		System.out.println("Equivalent: C-");
		System.out.println("Remarks: PASSED");
		}
		
		else if (num >= 50 && num <= 74)
		{
		System.out.println("Equivalent: F");
		System.out.println("Remarks: FAILED");
		}
		
		else
		{
		System.out.println("Remarks: ");
		}

	}

}


