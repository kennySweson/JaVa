package Luogu;

import java.util.Scanner;

public class Homework_findScore {
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][2];
		
		for(int i=0;i<n;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		
		int find=sc.nextInt();
		
		int ret=-1;
		
		for(int i=0;i<n;i++) {
			if(arr[i][0]==find) {
				ret=i;
				break;
			}
			
		}
		
		if(ret>=0) {
			System.out.println(arr[ret][0]+" "+arr[ret][1]);
		}
		else {
			System.out.println("Wrong");
		}
		
		

	}

}
