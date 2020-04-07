
public class FloatDoubleExample {
    public static void main(String[] args) {
        // 실수 타입(float, double)은 소수점이 있는 실수 데이터 저장
        // float = 4byte =, double = 8byte
        // double은 float보다 약 두 배의 자릿수가 배정되어 높은 정밀도를 요구하는 계산에서 사용
        // JAVA는 실수 리터럴의 기본 값을 double로 간주하기 때문에 실수 리터럴을 float에 저장하려면 리터럴뒤에 'f', 'F'를 입력해야한다.
        
        //실수값 저장
        double var1 = 3.14;
        //float var2 = 3.14; //컴파일 에러 : float타입을 사용하는데 리터럴 뒤에 'F'를 붙이지 않았기 때문
        float var3 = 3.14F;

        //정밀도 테스트
        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789F;

        System.out.println("var1 : " + var1);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);

        //e 사용하기
        int var6 = 3000000;
        double var7 = 3e6;
        float var8 = 3e6F;
        double var9 = 2e-3;
        double var10 = 2e4;

        System.out.println("var6 : " + var6);
        System.out.println("var7 : " + var7);
        System.out.println("var8 : " + var8);
        System.out.println("var9 : " + var9);
        System.out.println("var10 : " + var10);

    }

}