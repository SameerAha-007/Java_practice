import java.util.*;

public class AnagramOrNot
{

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Entert a String : ");

	    String st1 = sc.nextLine();

	    System.out.println("Enter other String : ");

	    String st2 = sc.nextLine();

	    if (st1.length()==st2.length()){

	        char c1[] = st1.toCharArray();

	        char c2[] = st2.toCharArray();

	        Arrays.sort(c1);

	        Arrays.sort(c2);

	        String s1 = new String(c1);

	        String s2 = new String(c2);

	    
	    if(s1.equals(s2)){

	        System.out.println("both are anagram");

	    }

	    }

	    else {

	        System.out.println("not anagram");

	    }

	}

}