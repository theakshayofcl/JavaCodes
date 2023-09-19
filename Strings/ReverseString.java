import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

   System.out.println ("Enter the String");
   Scanner s = new Scanner (System.in);
   String str = s.next();
    
    for (int i = str.length()-1;i>=0;i--){
        
        System.out.print(str.charAt(i));
    }
    
       
        
    }

}
