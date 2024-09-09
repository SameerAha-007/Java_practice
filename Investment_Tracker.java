import java.util.Scanner;
public class Investment_Tracker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Buying price per share: ");
        double buyingPrice=sc.nextDouble();
        int day=1;
        double closingPrice;
        double[] weekly=new double[7];
        for (int i=0;i<7;i++){
            System.out.println("Enter the closing price for day"+(i+1)+" : ");
            weekly[i]=sc.nextDouble();
        }
        double[] profitOrLoss = new double[7];
        for (int i=0;i<weekly.length;i++){
            profitOrLoss[i]=weekly[i]-buyingPrice;
        }
        System.out.println("Earnings of the whole week: ");
        for (double k : profitOrLoss){
            String s=k>=0 ? "profit" : "loss";
            System.out.println("Day"+day+": "+k+" ("+s+")");
            day++;
        }
    }
}