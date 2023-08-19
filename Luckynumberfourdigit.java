 import java.util.Scanner;
    public class Practice{
        public static void main (String [] args){
            System.out.print("enter the four digit numbers :" );
            Scanner s = new Scanner (System.in);
            int n = s.nextInt();
// Extracting each digit from four digit in backward
            int fourdigit = (n%10);
            int thirddigit = (n/10)%10;
            int seconddigit = (n/100)%10;
            int firstdigit = (n/1000)%10;

        if ( firstdigit + seconddigit == thirddigit + fourdigit )
            System.out.println("its luckynumber");
        else
            System.out.println("its not lucky number");
        }
    }

