public class Variable {

    public static void main(String[] args) {
        //정수형
        byte by = -1;       // 1byte = 8bit = 256개 = -128 ~ 127
        short sh = 2;      // 2byte = 16bit = 65,536개 = -32768 ~ 32767
        int in = 4;          // 4byte = 32bit = 4,294,967,296개 = -2,147,483,648 ~ 2,147,483,647
        long lo = 8;        // 8byte = 64bit = 18,446,744,073,709,551,616개 = -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,808
        
        //실수형(소수점을 나타내기 위한 데이터형)
        float fl = 4;      // 4byte = 32bit
        double dou = 8.8;  // 8byte = 64bit

        in = in +2;
        System.out.println("정수형 입니다.");
        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lo);

        dou = dou + 0.2;
        System.out.println("실수형 입니다.");
        System.out.println(fl);
        System.out.println(dou);

        //문자형(하나의 문자, ''를 사용한다.)
        char ch = 'a';
        System.out.println("문자형 입니다.");
        System.out.println(ch);

        //문자열
        String str = "String";
        System.out.println("문자열 입니다.");
        System.out.println(str);

        //논리형
        boolean bool = true;
        System.out.println("논리형 입니다.");
        System.out.println(bool);
    }
}