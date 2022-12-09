import java.util.*;
public class Main{
	public static void main(String args[]) {
		int a,b,div=0;
		Scanner reader=new Scanner(System.in);
		a=reader.nextInt();
		b=reader.nextInt();
		boolean flag=true;
		
		try{
			div=a/b;
		}catch (Exception e) {
			// TODO: handle exception
			flag=false;
			System.out.println("ArithmeticException!!!");
		}

		if(flag) {
			System.out.print(div);
		}
	}
}