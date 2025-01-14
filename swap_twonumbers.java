//With temporary variable
//public class swap_twonumbers {
//    public static void swapi(int x,int y){
//        int temp =x;
//        x=y;
//        y=temp;
//        System.out.println("Number After swapping: x is : "+x+" y is : "+y);
//    }
//
//    public static void main(String[] args) {
//        int x=10;
//        int y=20;
//        System.out.println("Number After swapping: x is : "+x+" y is : "+y);
//        swapi(x,y);
//    }
//}


//Without temporary variable
public class swap_twonumbers {
    public static void swap1(int m,int n){
        m=m+n;
        n=m-n;
        m=m-n;
        System.out.println("After Swap: m = "+m+" n = "+n);
    }

    public static void main(String[] args) {
        int m=23;
        int n=54;
        System.out.println("Before Swap: m = "+m+" n = "+n);
        swap1(m,n);

    }
}