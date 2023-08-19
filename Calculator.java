import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        System.out.print("enter the number1 , op & number 2 (2+3) : ");
        Scanner s = new Scanner (System.in);
        double d1 = s.nextDouble();
        char c = s.next().charAt(0);
        double d2 = s.nextDouble();

      if (c=='+')
          System.out.println((int)d1+d2);
      
        else if(c=='-')
          System.out.println((int)d1-d2);
     
        else if(c=='*')
          System.out.println(d1*d2);
      
        else if (c=='/')
          System.out.println(d1/d2);
      
    }
}