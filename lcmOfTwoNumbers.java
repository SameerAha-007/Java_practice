/*
public class lcmOfTwoNumbers {
    public static void main(String[] args) {
        int a=23;
        int b=48;
        int ans = (a>b)?a:b;
        while(true){
            if (ans % a == 0 && ans % b == 0){
                break;
            }
            ans++;
        }
        System.out.println("Lcm of "+a+" and "+b+" is : "+ans);
    }
}
*/

// Using GCD
public class lcmOfTwoNumbers {
    public static int Gcd(int a, int b){
        if (a == 0) {
            return b;
        }
        return Gcd(b%a, a);
    }
    public static int Lcm (int a, int b){
        return (a/Gcd(a,b))*b;
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        System.out.println("Lcm of "+a+" and "+b+" is : "+Lcm(a,b));
    }
}