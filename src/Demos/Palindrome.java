package Demos;

public class Palindrome {

	public static void main(String[] args) {
	String str = "madam";
	StringBuilder sb = new StringBuilder(str);
	String rev = sb.reverse().toString();
	//String rev = new StringBuilder(str).reverse().toString();
	System.out.println(rev.equals(str) ? "Palindrome" : "Not Palindrome");
	//System.out.println(rev);
	
	//System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");

	}

}
