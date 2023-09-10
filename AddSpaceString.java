import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	System.out.println("Enter the String");
	Scanner s = new Scanner (System.in);
	
	String str = s.next();

	// intializing from 0 to length - 1 ,which is last character of the string
	
	
	for (int i = 0;i<=str.length()-1;i++){
	    
	    System.out.print(str.charAt(i)+" ");
	    
	}
	}
}