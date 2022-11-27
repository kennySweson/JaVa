package Luogu;

import java.util.Scanner;

public class Homework_score {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x;
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		
		if(x>=90&&x<=100) {
			System.out.println("A");
		}
		else if(x>=80&&x<=89){
			System.out.println("B");
		}
		else if(x>=70&&x<=79) {
			System.out.println("C");
		}
		else if(x>=60&&x<=69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}
