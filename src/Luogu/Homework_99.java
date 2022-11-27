package Luogu;

import java.util.Scanner;

public class Homework_99 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%d*%d=%2d  ", j,i,j*i);
			}
			System.out.println();
		}

	}

}
