public class Main
{
	public static void main(String[] args) {
	int year = 2025;
	if (year%400==0){
	    System.out.println ("its a leap year");
	}
	else if (year%100==0){
	    System.out.println("its not a leap year");
	}
	
	else if (year%4==0){
	    System.out.println("its a leap year");
	}
	else {
	    System.out.println("its not a leap year");
	}
	
	
	}
}