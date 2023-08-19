public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int f = 1, s = 2, t;
        System.out.println(f);
        System.out.println(s);
        for (int i = 3; i <= n; i++) {

            t = f + s;
            f = s;
            s = t;
            System.out.println(t);

        }
    }
}
