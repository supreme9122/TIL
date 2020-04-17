import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        // int A = 0;

        if(H > 23 || M > 59){
            System.out.println("시간을 잘못 입력 하셨습니다.");
        }else if(H >= 0 && M >= 45){
            M = M-45;
            System.out.println(H+" "+M);
        }else if(H > 0 && M < 45){
            M = M+60;
            M = M-45;
            H = H-1;
            System.out.println(H+" "+M);
        }else if(H == 0 && M < 45){
            M = M+60;
            M = M-45;
            H = 24-1;
            System.out.println(H+" "+M);
        }else{
            System.out.println("시간을 잘못 입력 하셨습니다.");
        }

    }
}