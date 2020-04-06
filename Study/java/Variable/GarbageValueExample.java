
public class GarbageValueExample {
    public static void main(String[] args) {
        byte var1 = 125;
        int var2 = 125;

        // for문 5회 반복실행
        for(int i=0; i<5; i++){
            var1++;
            var2++;
            System.out.println("var1 : " + var1 + " \t " + "var2 : " + var2);
            // byte변수는 127이 넘어가는 순간 -128로 다시 저장됨.
        }
    }
}