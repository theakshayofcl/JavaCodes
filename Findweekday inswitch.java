import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner s = new Scanner (System.in);
        int i = s.nextInt();
        switch (i) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
        }

    }
}