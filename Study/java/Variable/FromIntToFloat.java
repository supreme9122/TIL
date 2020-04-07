
public class FromIntToFloat {
    public static void main(String[] args) {
        // num1과 num2에 123456780을 저장시키고 num2를 float타입으로 변환시킨 후,
        // 다시 int타입으로 변환해서 num2에 저장하고 num1에서 num2를 빼면?

        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        num2 = (int)num3;

        int result = num1 - num2;
        System.out.println(result);

        // 값이 0이 나올것으로 예상했지만 -4가 출력된다.
        // float타입은 다음과 같은 비트 수가 할당 되어 있다.
        // float : 부호(1비트) + 지수(11비트) + 가수(23비트)
        // num2의 값 123456780은 23비트로 표현 할 수 없기 때문에 근사치로 값이 나온다.
        // 따라서 11라인에 자동 타입 변환 할 때 num3의 값은 근사치 값으로 num2에는 근사치 값이 저장된다.
        // 해결책으로 double 타입을 사용하면 된다.
        // double타입은 다음과 같은 비트 수가 할당 되어 있다.
        // double : 부호(1비트) + 지수(11비트) + 가수(52비트)
        // int의 크기는 32bit이므로 double의 가수52비트 보다 작기 때문에 어떠한 int값이라도 안전하게 정밀도 손실을 피할 수 있다.

    }

}