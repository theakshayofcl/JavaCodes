import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner s = new Scanner (System.in);
        int i = s.nextInt();
        switch (i%2) {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;

        }

    }
}