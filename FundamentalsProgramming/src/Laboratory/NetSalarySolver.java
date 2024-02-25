package Laboratory;
import java.util.Scanner;
public class NetSalarySolver {
	
public static void main(String[] args) {
	
	double rph, nhw, gp, np, sss, wh, deduction;
	
	System.out.println("≽^•⩊•^≼ Net Salary Solver ≽^•⩊•^≼");
	System.out.println(" ");
	
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter Employee's Name: ");
	String EmpName = scn.nextLine();
	System.out.print("Enter Employee's Department: ");
	String EmpDept = scn.nextLine();
	System.out.print("Enter Rate per Hour: ");
	rph = scn.nextDouble();
	System.out.print("Enter Number of Hours Worked: ");
	nhw = scn.nextDouble();
	scn.close();
	
	gp = rph * nhw;
	sss = gp * 0.05;
	wh = gp * 0.1;
	deduction = gp * 0.15 + 250;
	np = gp - deduction;
	
	System.out.println("");
	System.out.println("");
	System.out.println("≽^•⩊•^≼ Results ≽^•⩊•^≼");
	System.out.println("");
	System.out.println("Employee Name: " + EmpName);
	System.out.println("Department: " + EmpDept);
	System.out.println("Rate per Hour: " + rph);
	System.out.println("Number of Hours Worked: " + nhw);
	System.out.println("Gross Pay: " + gp);
	System.out.println("SSS: " + sss);
	System.out.println("Withholding Tax: " + wh);
	System.out.println("Pag-Ibig: 100");
	System.out.println("Philhealth: 150");
	System.out.println("Employee Net Salary: " + np);
	
	}
}