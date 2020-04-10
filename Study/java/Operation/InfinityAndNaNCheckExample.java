
public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        //p.84 Infinity와 NaN
        
        int x = 5;
        double y = 0.0;

        double z = x/y;

        System.out.println(Double.isInfinite(z));
        System.out.println(Double.isNaN(z));

        System.out.println(z+2);
    }
}