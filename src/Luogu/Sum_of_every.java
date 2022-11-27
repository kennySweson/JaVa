package Luogu;

import java.util.Scanner;

public class Sum_of_every {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int ans=0;
		while(x!=0) {
			ans+=x%10;
			x/=10;
		}
		System.out.println(ans);

	}

}
