
public class CheckOverflowExample {
    public static void main(String[] args) {
        try {
            int result = safeMultiply(46340, 46342);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("오버플로우가 발생하여 정확하게 계산 할 수 없음.");
        }
        

    }

    public static int safeAdd(int left, int right){
        if(right>0){
           if(left>Integer.MAX_VALUE-right){                    //2000000000>147483647
               throw new ArithmeticException("오버플로우발생");
           } 
        }else{
            if(left<Integer.MIN_VALUE-right){                  
                throw new ArithmeticException("오버플로우 발생2");
            }
        }
        return left+right;
    }
    public static int safeMultiply(int left, int right){
        if(right>0){
           if(left>Integer.MAX_VALUE/right){                    //1073741823
               throw new ArithmeticException("오버플로우발생");
           } 
        }else{
            if(left<Integer.MIN_VALUE/right){
                throw new ArithmeticException("오버플로우 발생2");
            }
        }
        return left*right;
    }
}