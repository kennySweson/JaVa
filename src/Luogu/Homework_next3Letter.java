package Luogu;

import java.util.Scanner;

public class Homework_next3Letter {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char x;
		Scanner sc=new Scanner(System.in);
		x=sc.next().charAt(0);
		int id=(int)x+3;//97-122
		if(id>122) {
			id-=26;
		}
		
		x=(char)id;
		System.out.println(x);
		

	}

}
