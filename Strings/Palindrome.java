import java.util.Scanner;

public class Main {
    
    public static void main (String [] args){
     
    System.out.println ("Enter the String");   
    Scanner s = new Scanner (System.in);
    String str = s.next();
      
      boolean palindrome = true;
     
     for (int i=0,j=str.length()-1;i<j;i++,j--){
         
     if (str.charAt(i)!=str.charAt(j)){
     
     palindrome = false;
     
     break;
     }
     
     }
     
        System.out.print(palindrome?"its palindrome":"its not palindrome");
        
    }
    
   
}