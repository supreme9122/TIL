
public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result1 = v1 + v2;
        System.out.println("result1 = "+ result1);

        int result2 = v1 - v2;
        System.out.println("result2 = "+ result2);

        int result3 = v1 * v2;
        System.out.println("result3 = "+ result3);

        int result4 = v1 / v2;
        System.out.println("result4 = "+ result4);

        int result5 = v1 % v2;
        System.out.println("result5 = "+ result5);

        double result6 = v1 / (double)v2;       //소수점 첫째자리 수를 정확하게 구하기위해 v1, v2둘중 하나를 Casting(강제타입변환)함.
        System.out.println("result6 = "+ result6);
    }
}