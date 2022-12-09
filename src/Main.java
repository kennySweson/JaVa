import java.util.*;
public class Main{
	
	public static class AgeException extends Exception{
		private String message="";
		
		public AgeException() {
			
		}
		public AgeException(String s) {
			// TODO 自动生成的构造函数存根
			this.message=s;
		}
		
		public String toString() {
			return message;
		}
		
	}
	
	
	public static boolean checkAge(int age) throws AgeException {
		AgeException a=new AgeException();
		if(age<0) {
			a.message="error";
			throw a;
		}
		else if (age>=10&&age<=79) {
			return true;
		}
		else if((age>=0&&age<=9)||(age>=80&&age<=100)) {
			return false;
		}
		else if (age>100) {
			a.message="too old";
			throw a;
		}
		return false;
		
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		try {
			if(checkAge(age)) {
				System.out.print("OK");
			}
			else {
				System.out.print("fail");
			}
		}catch (AgeException a) {
			// TODO: handle exception
			System.out.print(a.toString());
		}
		
	}
}
