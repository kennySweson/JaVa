package Luogu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class max_semiMax {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> arrayList=new ArrayList();
		
		for(int i=0;i<n;i++) {
			arrayList.add(sc.nextInt());
		}
		Collections.sort(arrayList);
		
		System.out.print(arrayList.get(n-1)+" "+arrayList.get(n-2));

	}

}
