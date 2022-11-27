package Luogu;

import java.util.Scanner;

public class Homework_Sgn {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextDouble();
		if(x>0) {
			System.out.print(1);
		}
		else if(x==0) {
			System.out.print(0);
		}
		else {
			System.out.print(-1);
		}

	}

}
