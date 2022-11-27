package Luogu;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime_between {

	public static boolean isPrime(int x) {
		boolean flag=true;
		if(x==1) {
			return false;
		}
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				return false;
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int down=Math.min(a,b);
		int up=Math.max(a, b);
		for(int i=down;i<=up;i++) {
			if(isPrime(i)) {
				arr.add(i);
			}
		}
		for(int j=0;j<arr.size();j++) {
			System.out.print(arr.get(j));
			if(j!=arr.size()-1) {
				System.out.print(",");
			}
		}

	}

}
