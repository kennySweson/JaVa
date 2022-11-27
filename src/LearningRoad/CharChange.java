package LearningRoad;

import java.util.Scanner;

public class CharChange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char x=sc.next().charAt(0);
		
		int ascii=Integer.valueOf(x);
		
		ascii=ascii-96;
		System.out.println(ascii);
		
		
		
	}

}
