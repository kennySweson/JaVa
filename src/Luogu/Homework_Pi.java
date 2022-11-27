package Luogu;

import java.util.Scanner;

public class Homework_Pi {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double total=0;
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			total+=Math.pow(1.0/i, 2);
		}
		total*=6;
		total=Math.pow(total, 0.5);
		
		System.out.printf("%.4f",total);
	}

}
