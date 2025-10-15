package Demos;

public class Prime {

	public static void main(String[] args) {
		int num=29,count=0;
		for (int i=2;i<num/2;i++) {
			if(num%i==0) 
				count++;
		}
				System.out.println(count==0 ?  "Prime" : "NotPrime");
			}
		}
	
		
		
