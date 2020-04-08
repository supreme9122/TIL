import java.util.Scanner;

public class ABOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

        double c = 10e-9*sc.nextDouble();
        double d = 10e-9*sc.nextDouble();

        System.out.println(c/d);
        sc.close();
    }

}
