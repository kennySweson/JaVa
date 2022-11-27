package Luogu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapMaxMin {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arrayList=new ArrayList();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			arrayList.add(sc.nextInt());
		}
		
		int id_max=arrayList.indexOf(Collections.max(arrayList));//获取最大值索引
		int id_min=arrayList.indexOf(Collections.min(arrayList));
		
		int temp=arrayList.get(id_max);//临时存储最大数字
		arrayList.set(id_max,arrayList.get(id_min));
		arrayList.set(id_min,temp);
		
		for(int i=0;i<n;i++) {
			if(i!=n-1) {
				System.out.print(arrayList.get(i)+" ");
			}
			else {
				System.out.print(arrayList.get(i));
			}
		}
		

	}

}
