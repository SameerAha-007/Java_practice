/*
//right angle triangle
public class Star_pattern
{
	public static void main(String[] args) {
	    int k=1;
		for(int i=1;i<=5;i++){
		    for (int j=1;j<=i;j++){
		        System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}

//reduced inverted triangle
public class Star_pattern
{
	public static void main(String[] args) {
	    
		for(int i=1;i<=5;i++){
		    for (int j=i;j<=5;j++){
		        System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}

//growing triangle
public class Star_pattern
{
	public static void main(String[] args) {
	    int k=5;
		for(int i=1;i<=k;i++){
		    for (int l=1;l<=k-i;l++){
		        System.out.print(" ");
		    }
		    for (int j=1;j<=i;j++){
		       System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}

//right-angled triangle
public class Star_pattern
{
	public static void main(String[] args) {
	    int k=5;
		for(int i=1;i<=k;i++){
		    for (int l=1;l<=k-i;l++){
		        System.out.print(" "+" ");
		    }
		    for (int j=1;j<=i;j++){
		       System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}

*/

//pyramid
public class Star_pattern
{
	public static void main(String[] args) {
	    int k=5;
		for(int i=1;i<=k;i++){
		    for (int l=1;l<=k-i;l++){
		        System.out.print(" "+" ");
		    }
		    for (int j=1;j<=(2*i)-1;j++){
		       System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}
