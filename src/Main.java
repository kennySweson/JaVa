import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        String s;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=DtoH(n);
        System.out.println(s);
    }
    

    public static String DtoH(int n) {
    	String basic=new String("0123456789ABCDEF");
    	StringBuilder sb=new StringBuilder();
    	
    	while(n>16) {
    		int temp=n%16;
    		sb.append(basic.charAt(temp));
    		n/=16;
    	}
    	
    	sb.append(basic.charAt(n));
    	sb.reverse();
    	
    	return sb.toString();
    }
    
}