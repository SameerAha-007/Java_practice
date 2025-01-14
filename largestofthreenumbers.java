//Ternary operator
/*
public class largestofthreenumbers {

    public static int largestOfThree(int a, int b, int c){
        return c>(a>b?a:b)?c:((a>b)?a:b);
    }

    public static void main(String[] args) {
        int largest;
        int a=23;
        int b=48;
        int c=11;
        largest=largestOfThree(a,b,c);
        System.out.println("Largest number among three : "+largest);
    }
}
*/

//if-else
public class largestofthreenumbers{
    public static void main(String[] args) {
        int a=234;
        int b=11;
        int c=28;
        if (a >= b && a >= c) {
            System.out.println("Largest Number Among Three : " + a);
        }
        else if (b >= c && b >= a){
            System.out.println("Largest Number Among Three : "+b);
        }
        else{
            System.out.println("Largest Number Among Three : "+c);
        }
    }
}