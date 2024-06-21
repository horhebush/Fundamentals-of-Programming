package Laboratory;

import java.util.ArrayList;
public class ArrayListFinals {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		
	    colors.add("Baby Blue");
	    colors.add("Black");
	    colors.add("Pink");
	    colors.add("Violet");
	    colors.add("Aqua");
	    colors.add("Green");
	    colors.add("Gray");
	    colors.add("Blue");
	    colors.add("Yellow");
	    colors.add("Red");
	    System.out.println("\tAll Elements\n");
	    System.out.println("Colors: " + colors);
	    
	    System.out.println("\n\n\tChange Element 1 and 4\n");	
	    colors.set(0,"Brown");	
	    colors.set(3,"Navy Blue");	
	    System.out.println("New Changes: " + colors);	
	    
	    System.out.println("\n\n\tRemove Element 5, 7, and 8\n");	
	    colors.remove("Aqua");
	    colors.remove("Gray");
        colors.remove("Blue");
	    System.out.println("Removed Colors: " + colors);
	    
	    System.out.println("\n\n\tAdd new Colors\n");	
	    colors.add("Blond");
	    colors.add("Blush");
        colors.add("Rose");
        colors.add("Orange");
        colors.add("Cyan");
	    System.out.println("Added Colors: " + colors);
	    
	    System.out.println("\n\n\tRemove Aqua, Blue, and Gray\n");	
	    colors.remove("Aqua");
	    colors.remove("Gray");
        colors.remove("Blue");
	    System.out.println("Final Changes: " + colors);
	    
	}

}
