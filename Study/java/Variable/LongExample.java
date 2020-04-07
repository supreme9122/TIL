
public class LongExample {
    public static void main(String[] args) {
        // long타입은 8byte로 표현되는 정수값을 저장
        // 8byte = 64bit = 18,446,744,073,709,551,616개 = -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,808
        // long타입 변수를 초기화 할때는 정수값 뒤에 'l', 'L'을 붙여 8byte 정수 데이터임을 알려주는것.

        long var1 = 10;
        long var2 = 20L;
        // long var3 = 1000000000000;       //컴파일 에러 : int범위를 초과 하였으나 'L'을 붙이지 않았기 때문
        long var4 = 1000000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);

    }

}