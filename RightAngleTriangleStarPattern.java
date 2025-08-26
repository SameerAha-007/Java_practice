//public class RightAngleTriangleStarPattern {
//    public static void rightangle(int n){
//        int i, j;
//        for (i=0;i<n;i++){
//            for (j=0;j<=i;j++){
//                if (j==4 && i==4) //To remove the space at the End
//                    System.out.print("*");
//                else
//                    System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int k=5;
//        rightangle(5);
//    }
//}

public class RightAngleTriangleStarPattern {
    public static void rightangle(int n){
        int i, j;
        for (i=0;i<n;i++){
            for(j=2*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int k=5;
        rightangle(5);
    }
}
