
public class FromInToDouble {
    public static void main(String[] args) {
        
        int num1 = 123456780;
        int num2 = 123456780;

        double num3 = num2;
        num2 = (int)num3;

        int result = num1 - num2;
        System.out.println(result);

        // 앞선 예제 float타입으로 정밀도 손실이 발생 했으나
        // double타입을 사용하니 정밀도 손실을 피할 수 있었다.

    }

}