public class Solution {
    public double myPow(double x, int n) {
        double i = power(x, n/2);
        if (n > 0){
            if (n % 2 == 0){
                return i * i;
            }else{
                return i * i * x;
            }
        }else if (n == 0){
            return 1;
        }else{
            if (n % 2 == 0){
                return 1 / (i * i);
            }else{
                return 1/ (i * i * x);
            }
        }
    }
}