
public class StringEqualsExample {
    public static void main(String[] args) {
        //p.91 문자열 비교
        String strVar1 = "신민철";
        String strVar2 = "신민철";
        String strVar3 = new String("신민철");

        System.out.println(strVar1 == strVar2);         //true
        System.out.println(strVar2 == strVar3);         //false
        System.out.println();
        System.out.println(strVar1.equals(strVar3));    //true
        System.out.println(strVar2.equals(strVar3));    //true
    }
}