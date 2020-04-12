
public class CompareOperatorExample2 {
    public static void main(String[] args) {
        //p.89 비교 연산자
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3);       //true

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5);                   //false v5의 0.1f는 0.1의 근사값(0.10000000149011612)이기 때문이다.
        System.out.println((float)v4 == v5);            //true
        System.out.println((int)v4*10 == (int)v5*10);   //true
    }
}