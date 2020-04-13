
public class OperationsPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        //byte byteValue3 = byteValue1 + byteValue2;    //컴파일 에러 : 자바의 정수 연산일 경우 int타입을 기본으로 한다.
        int intValue = byteValue1 + byteValue2;
        System.out.println(intValue);

        char charValue1 = 'A';
        char charValue2 = 1;
        //char charValue3 = charValue1 + charValue2;    //컴파일 에러 : 위 사유와 동일
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드 : " + intValue2);
        System.out.println("출력문자 : " + (char)intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println(intValue4);

        int intValue5 = 10;
        //int intValue6 = 10 / 4.0;    //컴파일 에러 : 4.0은 실수 이기때문에 강제 타입 변환를 해야함.
        double doubleValue = intValue5 / 4.0;
        System.out.println(doubleValue);

    }

}