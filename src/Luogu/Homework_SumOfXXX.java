package Luogu;

import java.util.Scanner;

public class Homework_SumOfXXX {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		int x1=x/100;
		int x2=x%100/10;
		int x3=x%10;
		System.out.println(x1+x2+x3);

	}

}
