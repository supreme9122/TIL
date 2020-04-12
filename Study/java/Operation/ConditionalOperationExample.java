
public class ConditionalOperationExample {
    public static void main(String[] args) {
        //p.101 삼항 연산자
        int score = 85;
        char grade = (score > 90 ? 'A' : 'B');
        System.out.println(score+"점은 "+grade+"등급입니다.");
    }
}