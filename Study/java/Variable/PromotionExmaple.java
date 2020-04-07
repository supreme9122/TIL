
public class PromotionExmaple {
    public static void main(String[] args) {
        // 이것이 자바다. p.51
        
        // int intValue = 200;
        // double doubleValue = intValue;   // 200.0
        
        // char charValue = 'A';
        // int intValue = charValue;           // 65

        // 자동타입 변환에서 단 하나의 예외
        // char는 2byte 크기를 가지지만, char의 범위는 음수가 없기 때문에 byte타입을 char타입으로 변환 시킬 수 없다.

        // byte byteValue = 65;
        // char charValue = byteValue       // 컴파일 에러

        byte byteValue = 10;
        int intValue = byteValue;           // byte → int 
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;               // char → int
        System.out.println("가의 유니코드 : " + intValue);

        intValue = 500;
        long longValue = intValue;          // int → long
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue;      // int → double
        System.out.println(doubleValue);

        // short shortValue = 65;
        // charValue = shortValue;          // 위 설명과 마찬가지로 short도 자동형 변환이 안된다.

    }

}