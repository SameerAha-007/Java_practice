//Brute Force Method
public class RangeOfPrimeNumbers {
    public static void primeN(int n) {
        System.out.println("Prime numbers from 1 to "+n+" is : ");
        for (int x = 1; x <= n; x++) {
            if (x == 1 || x == 0)
                continue;
            int flag=1;
            for (int y=2;y<=x/2;++y){
                if (x%y==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.print(x+" ");
            }
        }
    }

    public static void main(String[] args) {
        primeN(45);
    }
}