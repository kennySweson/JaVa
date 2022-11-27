package Luogu;

import java.util.Scanner;



public class Homework_sortStudent {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][2];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}//get array
		
		for(int i=0;i<n-1;i++) {
			int max=i;//假设当前为最大
			for(int j=i+1;j<n;j++) {
				if(arr[j][1]>arr[max][1]) {
					max=j;
				}
			}
			if(max!=i) {
				int temp1=arr[i][0];
				int temp2=arr[i][1];
				
				arr[i][0]=arr[max][0];
				arr[i][1]=arr[max][1];
				
				arr[max][0]=temp1;
				arr[max][1]=temp2;
			}
		}
		
		for(int i=0;i<n;i++) {
			
			System.out.printf("%d %d\n",arr[i][0],arr[i][1]);
			
		}
	

	}

}
