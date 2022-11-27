//package Luogu;
//
//import java.util.Scanner;
//
//public class Homework_Sum_prime {
//	
//	public boolean is_prime(int x) {
//		boolean flag=true;
//		if(x==1||x%2==0||x%3==0||x%5==0||x%7==0||x%11==0) {
//			flag=false;
//		}
//		else {
//			for(int i=13;i<x;i++) {
//				if(x%i==0) {
//					flag=false;
//				}
//			}
//		}
//		return flag;
//	}
//	
//
//	public static void main(String[] args) {
//		// TODO 自动生成的方法存根
////		Main main=new Main();
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int count=0;
//		int total=0;
//		for(int i=997;i>0;i--) {
////			if(main.is_prime(i)) {
//				System.out.print(i);
//				count++;
//				total+=i;
//				if(count!=n) {
//					System.out.print("+");
//				}
//				else {
//					System.out.printf("=%d",total);
//					break;
//				}
//			}
//			
//		}
//		
//
//	}
//
//}
