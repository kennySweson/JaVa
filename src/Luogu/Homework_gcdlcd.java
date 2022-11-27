package Luogu;

import java.util.Scanner;

public class Homework_gcdlcd {
	
	public int gcd(int x,int y) {
		for(int i=Math.max(x, y);i>0;i--) {
			if(x%i==0&&y%i==0) {
				return i;
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
//		// TODO 自动生成的方法存根
//		Scanner sc=new Scanner(System.in);
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		
//		Main main=new Main();
//		int gcd=main.gcd(x, y);
//		
//		int lcd=x*y/gcd;
//		
//		System.out.printf("%d %d",gcd,lcd);
		
		

	}

}
