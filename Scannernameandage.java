import java.util.Scanner;
public class Scannernameandage {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        System.out.print("Enter your name and Your age: ");
        String name = s.next();
        int age = s.nextInt();
        System.out.println("Your name is "+ name);
        System.out.println("Your age is " + age);

    }
}


