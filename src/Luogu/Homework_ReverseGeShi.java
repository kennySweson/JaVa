package Luogu;

import java.util.Scanner;

public class Homework_ReverseGeShi {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		int ge=x%10;
		int shi=x/10%10;
		
		int ot=x/100*100;
		
		System.out.println(ot+ge*10+shi);

	}

}
