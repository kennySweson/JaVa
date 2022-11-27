package Luogu;

import java.util.Scanner;

public class Homework_RunYear {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x;
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		
		if((x%4==0&&x%100!=0)||x%400==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
