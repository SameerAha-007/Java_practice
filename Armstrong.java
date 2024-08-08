import java.util.Scanner;

public class Armstrong
{

	public static void main(String[] args)
 {
	    Scanner sc=new Scanner(System.in);

            System.out.println("enter a number");

	    int num = sc.nextInt();
		int c=0;
		int t=num;
		while (num>0){
		        int k=num%10;
		            c++;
		            num=num/10;
		        }
		    int sum=0;
		    int p=t;
		    while (t>0){
		        int l=t%10;
		        sum=sum+(int)Math.pow(l, c);
		        t=t/10;
		        
		    }
		    if (p==sum){
		        System.out.println("is armstrong");
		    }
		    else{
		        System.out.println("is not armstrong");
		    }
    }

}
