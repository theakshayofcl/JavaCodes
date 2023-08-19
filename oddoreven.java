import java.util.Scanner;

public class Sample{
    public static void main (String [] args){
        System.out.println( "Enter the number :");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
      if (i % 2 ==0){
          System.out.println( "its even");
      }
      else{
          System.out.println("its odd");
      }
    }
}