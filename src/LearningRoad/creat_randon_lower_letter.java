package LearningRoad;

import java.util.Random;

public class creat_randon_lower_letter {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random random=new Random();
		for(int i=0;i<4;i=i+1) {
			int a=97+(int)(Math.random()*26);
			char x=(char)a;
			System.out.print(x);
		}

	}

}
