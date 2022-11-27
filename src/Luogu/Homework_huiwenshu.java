package Luogu;

import java.util.Scanner;

public class Homework_huiwenshu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		
		StringBuilder str2=new StringBuilder(s);
		str2.reverse();
		boolean flag=true;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=str2.charAt(i)) {
				flag=false;
				System.out.println("No");
				break;
			}
			
		}
		if(flag==true) {
			System.out.println("Yes");
		}
		

	}

}
