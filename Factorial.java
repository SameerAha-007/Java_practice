/*
//factorial with do-while loop
import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args) {
        int i=1,fact=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do{
            fact=fact*i;
            i++;
        }while(i<=n);
        System.out.println(fact);
    }
}

//factorial with while loop
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        int i=1,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to get factorial:");
        int n=sc.nextInt();
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("The Factorial of "+n+" is:"+fact);
    }
}

//factorial with for loop
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to get factorial:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The Factorial of "+n+" is:"+fact);
    }
}
*/