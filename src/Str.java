import java.util.Scanner;
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = "   Kaixo, hau proba bat da   ";
		String str1 = "   Kaixo, hau proba bat da   ";
		String str2 = "Agur   ";
		long c= 444444443444444l;
		
		
		char result = str.charAt(5);
		System.out.println("charAt "+result);
		
		int a = str.length();
		System.out.println("length "+a);
	
		String b = str.substring(8);
		System.out.println("substring "+b);
		
		b = str.trim();
		System.out.println("trim "+b);
		
		a = str.compareTo(str1);
		System.out.println("compare to "+a);
		
		a = str1.compareTo(str2);
		System.out.println("compare to "+a);
		
		a = str.compareToIgnoreCase(str1);
		System.out.println("compare to ignore case "+a);
		
		a = str.compareToIgnoreCase(str2);
		System.out.println("compare to ignore case "+a);
		
		a = str1.compareToIgnoreCase(str2);
		System.out.println("compare to ignore case "+a);
		
		System.out.print("Found Index :" );
	    System.out.println(str.indexOf( 'o' ));
		
		System.out.print("Found Last Index :" );
	    System.out.println(str.lastIndexOf('a'));
	    
		System.out.print("Value of c :" );
	    System.out.println(String.valueOf(c));
	    
	    System.out.println("Are you a student? Answer true or false");
	    boolean d = sc.nextBoolean();
	     if (d==true) {
	    	 System.out.println("You are a student");
	     }
	     else {
	    	 System.out.println("You aren't a student");
	     }
		
		
	}

}
