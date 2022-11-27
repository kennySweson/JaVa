package Luogu;

import java.util.Scanner;

public class Homework_star {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				if(k!=i) {
					System.out.print("* ");
				}
				else {
					System.out.print("*");
				}
			}
			
			
			System.out.println();
			
		}
		
		for(int i=1;i<=n-1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=n-i;k++) {
				if(k!=n-i) {
					System.out.print("* ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
		
		
    }


}


