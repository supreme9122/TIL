
public class LogicalOperatorExample {
    public static void main(String[] args) {
        //p.93 논리 연산자

        int charCode = '9';
        System.out.println(charCode);

        if((charCode>=65)&(charCode<=90)){
            System.out.println("대문자 이군요");
        }

        if((charCode>=97)&&(charCode<=122)){
            System.out.println("소문자 이군요");
        }

        if(!(charCode<48)&&!(charCode>57)){                 //'!'는 피연산자의 논리값을 바꾼다.(< → >=, > → <=로 바꿈)
            System.out.println("0~9 숫자 이군요");
        }

        int value = 6;

        if((value%2 == 0)||(value%3 == 1)){
            System.out.println("2또는 3의 배수 이군요");
        }

        if((value%2 == 0)||(value%3 == 0)){
            System.out.println("2또는 3의 배수 이군요");
        }
   }
}