/*output
 1 2 3
 4 5 6
 7 8 9
*/
public class Number_Pattern
{
	public static void main(String[] args) {
	    int k=1;
		for(int i=1;i<=3;i++){
		    for (int j=1;j<=3;j++){
		        System.out.print(k+" ");
		        k++;
		    }
		    System.out.println();
		}
	}
}


/*output
9 8 7
6 5 4
3 2 1
*/
public class Number_Pattern
{
	public static void main(String[] args) {
	    int k=9;
		for(int i=1;i<=3;i++){
		    for (int j=1;j<=3;j++){
		        System.out.print(k+" ");
		        k--;
		    }
		    System.out.println();
		}
	}
}

/*output
 1 2 3
 2 4 6
 3 6 9
*/
public class Number_Pattern
{
	public static void main(String[] args) {
	    int k=1;
		for(int i=1;i<=3;i++){
		    for (int j=1;j<=3;j++){ 
		        k=j*i;
		        System.out.print(k+" ");
		    }
		    System.out.println();
		}
	}
}

/*output
1
12
123
1234
12345
*/
public class Star_pattern
{
	public static void main(String[] args) {
	    int k=1;
		for(int i=1;i<=5;i++){
		    for (int j=1;j<=i;j++){
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}
