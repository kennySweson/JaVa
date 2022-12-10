import java.util.*;
public class Main{
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] ans=str.split(",");
		
		int a = 0;
		
		for(int i=0;i<ans.length;i++) {
			boolean flag=true;
			try {
				a=Integer.valueOf(ans[i]);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("NumberFormatException");
				flag=false;
			} finally {
				if(flag) {
					System.out.println(a);
				}
				System.out.println("the index is "+i);
			}
		}
		
	}
}
