package Luogu;

import java.util.Scanner;

public class Homework_UpandDown {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Double x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextDouble();
		int ans1=(int)Math.floor(x);
		int ans2=(int)Math.ceil(x);
		System.out.println(ans1+" "+ans2);

	}

}
