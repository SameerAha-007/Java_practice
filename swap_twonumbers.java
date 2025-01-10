public class swap_twonumbers {
    public static void swapi(int x,int y){
        int temp =x;
        x=y;
        y=temp;
        System.out.println("Number After swapping: x is : "+x+" y is : "+y);
    }

    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println("Number After swapping: x is : "+x+" y is : "+y);
        swapi(x,y);
    }
}
