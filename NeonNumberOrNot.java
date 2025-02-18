public class NeonNumberOrNot {
    public static boolean neon(int n){
        int sq=n*n;
        int sum=0;
        while (sq>0){
            int rem=sq%10;
            sum+=rem;
            sq=sq/10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int num=8;
        if (neon(num)){
            System.out.println(num+" is a Neon Number");
        }
        else{
            System.out.println(num+" is not a Neon Number");
        }
    }
}
