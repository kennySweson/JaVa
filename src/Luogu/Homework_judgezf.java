package Luogu;

import java.util.Scanner;

public class Homework_judgezf {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		if((a>0&&b>0)||(a<0&&b<0)) {
			System.out.println(a*b);
		}
		else {
			System.out.println(a+b);
		}

	}

}
