package Luogu;

import java.util.Scanner;

public class Homeworw_isPrime {
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			n=sc.nextInt();
			boolean result=isPrime(n);
			System.out.println(result);
		}
        
    }

	public static boolean isPrime(int n) {
		boolean flag=true;
		if(n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		
		return flag;
	}


}
