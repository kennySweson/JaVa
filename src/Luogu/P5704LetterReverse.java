package Luogu;

import java.util.Scanner;

public class P5704LetterReverse {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char x;
		Scanner sc=new Scanner(System.in);
		x=sc.next().charAt(0);
		int ans=(int)x;
		ans=ans-32;
		x=(char)ans;
		System.out.println(x);

	}

}
