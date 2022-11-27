package LearningRoad;

import java.util.Scanner;

public class Sum_of_xxx {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);

		int x=sc.nextInt();
		
		int a=x%10;
		int b=x%100/10;
		int c=x/100;
		
		System.out.println(a+b+c);

	}

}
