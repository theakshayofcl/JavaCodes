import java.util.Scanner;
public class Practice {
    public static void main (String [] args){

        System.out.println("Enter the number : " );
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();


        for (int i=1;i<=n/2; i++){

          if(n%i==0)
              System.out.print(i+" ");

        }

    }
}