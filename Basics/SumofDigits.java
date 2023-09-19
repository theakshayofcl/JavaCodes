import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 System.out.println ("Enter the number : ");
	 Scanner s = new Scanner (System.in);
	 int n = s.nextInt();
	 
	 int sum = 0;
	 while (n>0){
	     
	     int temp = n % 10;
	     sum = sum + temp;
	     n = n / 10;
	 }
	 System.out.println(sum);
	}
}