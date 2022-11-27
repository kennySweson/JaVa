package Luogu;

import java.util.Scanner;

public class Homework_Triangle {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		if(a+b>c&&a+c>b&&c+b>a) {
			double p=(a+b+c)/2;
			double A=Math.pow(p*(p-a)*(p-b)*(p-c), 0.5);
			double B=Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.printf("%.2f", A);
			System.out.println(String.format("%.2f",B));
		}
		else {
			System.out.print("Wrong");
		}
	}

}
