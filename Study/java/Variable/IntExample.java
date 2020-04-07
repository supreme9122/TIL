
public class IntExample {
    public static void main(String[] args) {
        // int 타입은 4byte로 표현되는 정수값을 저장
        // 4byte = 32bit = 4,294,967,296개 = -2,147,483,648 ~ 2,147,483,647
        // int 타입은 정수 연산을 위한 기본 타입이기 때문에 byte, short 타입으로 연산하면 int타입으로 자동 변환된다.
        
        int var1 = 10;
        int var2 = 012;
        int var3 = 0xA;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);

        // 결과값은 모두 10으로 동일하다.
    }

}