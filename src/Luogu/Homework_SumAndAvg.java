package Luogu;

import java.util.Scanner;

public class Homework_SumAndAvg {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double[] array=new double[10];
		Scanner sc=new Scanner(System.in);
		
		double total=0;
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextDouble();
			total+=array[i];
		}
		
		System.out.printf("%.1f %.1f",total,total/array.length);

	}

}
