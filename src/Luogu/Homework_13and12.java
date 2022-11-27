package Luogu;

import java.util.Scanner;

public class Homework_13and12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextDouble();
		double ans1=Math.sqrt(x);
		double ans2=Math.pow(x, 1.0/3);
		System.out.println(String.format("%.2f",ans1)+" "+String.format("%.2f",ans2));

	}

}
