public class LeapYearOrNot {
    public static void leap(int y){
        boolean flag=false;
        if (y%4==0){
            flag=true;
            if(y%100==0){
                flag= y % 400 == 0;
            }
        }
        if (!flag){
            System.out.println(y+" is Non Leap Year");
        }
        else{
            System.out.println(y+" is Leap year");
        }
    }

    public static void main(String[] args) {
        int y1=1895;
        int y2=1896;
        leap(y1);
        leap(y2);
    }
}
