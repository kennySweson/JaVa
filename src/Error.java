import java.util.Scanner;

public class Error {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		boolean b_1=true,b_2=true;
		String str_1=sc.nextLine();
		String str_2=sc.nextLine();
		double b = 0;
		if(str_2.equals("1")) {
			try {
				int a=Integer.valueOf(str_1).intValue();
			}catch (Exception e) {
				// TODO: handle exception
				b_1=false;
				System.out.println("cast int error");
			}
			
			if(b_1) {
				System.out.println("OK");
			}
			System.out.println("all done");
			
		}
		
		else {
			try {
				b=Double.valueOf(str_1).doubleValue();
			}catch (Exception e) {
				// TODO: handle exception
				b_2=false;
				System.out.println("cast double error");
			}
			
			if(b_2) {
				System.out.println("OK");
			}
			System.out.println("all done");
			System.out.println(b);
			
		}
		
		

	}

}
