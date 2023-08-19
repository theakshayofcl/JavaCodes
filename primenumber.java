import java.util.Scanner;
public class Practice {
    public static void main (String [] args){

        System.out.println("Enter the number : " );
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();

        boolean prime = true;
        for(int i=2;i<n;i++){

            if(n%i==0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime);
    }
}
