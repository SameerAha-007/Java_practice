import java.util.Scanner;

public class PerfectNumberOrNot
{

	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);

	    int num = sc.nextInt();

		int sum=0;

		int t=num;

		for (int i=1;i<num;i++){

		    if(num%i==0){

		        sum+=i;

		    }

		}

		if (sum==t){

		    System.out.println(t+" is Perfect Number");

		}

		else{

		    System.out.println(t+" is not Perfect Number");

		}

	}

}