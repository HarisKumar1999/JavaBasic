package Demos;

public class ReverseString {
	public static void main (String[] args) {
		String input = "Harish";
		/*String Reverse = " ";
		for(int i=input.length()-1;i>=0;i--) {
			Reverse+=input.charAt(i);
		}
		System.out.println(Reverse);*/
		StringBuffer sb = new StringBuffer(input);
		String rev = sb.reverse().toString();
		System.out.println(rev);
				
	}

}
