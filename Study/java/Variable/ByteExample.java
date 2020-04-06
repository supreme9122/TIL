public class ByteExample{
    public static void main(String[] args) {
        //byte 타입은 색상 정보 및 파일 또는 이미지 등의 이진 데이터 처리를 주로한다.
        //1byte = 8bit = 256개 = -128 ~ 127 (양수에서 0이 포함되기 때문에 127까지)
        //위 범위를 초과하는 타입 변수가 저장될때 error 발생.
        
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        //byte var6 = 128; //컴파일 에러
        
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        //System.out.println(var6);
        }
    }