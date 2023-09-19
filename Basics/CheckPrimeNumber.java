import java.util.Scanner;

public class Main {
    
    public static void main (String [] args){
        
     System.out.println ("Enter the Number");
     Scanner s = new Scanner (System.in);
     int n = s.nextInt();
     
      boolean prime = true;
      
      for (int i = 2; i<n; i++){
          
          if (n%i==0){
              prime = false;
              break;
          }
          
          
      }
        
        System.out.print(prime?"its prime number":"its not prime number");
               
    }
    
   
}