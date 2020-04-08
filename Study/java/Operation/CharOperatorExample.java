
public class CharOperatorExample {
    public static void main(String[] args) {
        char c1 = (char)('A' + 1);
        char c2 = 'A';
        //char c3 = c2 + 1;     //컴파일 에러 : c2는 산술 연산의 기본 타입인 int로 변환 되어 연산하고,
                                //             char 타입 변수 c3에 대입이 불가능하여 컴파일 에러 발생.
                                //             Casting(강제타입변환)을 통해 char타입으로 얻어야 한다.
                                //             char c3 = (char)(c2+1);
        System.out.println("c1 : "+ c1);        //B
        System.out.println("c2 : "+ c2);        //A
        //System.out.println("c1 : "+ c1);
    }
}