package java_final;

import java.util.Scanner;



public class Main {

	public static boolean isPrime(int x) {

		boolean flag=true;

		if(x==1) {

			flag=false;

			return flag;

		}

		else if(x==2){

			flag=true;

			return flag;

		}

		for(int i=2;i<x;i++) {

			if(x%i==0) {

				flag=false;

			}

		}

		return flag;

	}

	public static boolean isCoprime(int m,int n) {

		int ans=0;

		for(int i=1;i<=Math.min(m, n);i++) {

			if(Math.min(m, n)%i==0) {

				ans=i;

			}

		}

		if(ans==1) {

			return true;

		}else {

			return false;

		}

	}

	public static void main(String[] args) {

		// TODO 自动生成的方法存根

		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();

		int b=sc.nextInt();

		if(isPrime(a)) {

			System.out.println(a+" is prime");

		}

		else {

			System.out.println(a+" is not prime");

		}

		if(isPrime(b)) {

			System.out.println(b+" is prime");

		}

		else {

			System.out.println(b+" is not prime");

		}

		if(isCoprime(a, b)) {

			System.out.println(a+" and "+b+" are coprime");

		}

		else {

			System.out.println(a+" and "+b+" are not coprime");

		}



	}



}

