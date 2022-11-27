import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Count {
	
	
	public static String format(String s) {
		s=s.toLowerCase();
		return s;
	}
	
	
	public static ArrayList<String> to_list(String[] temp){
		int n=temp.length;
		ArrayList<String> s=new ArrayList<>();
		for(int i=0;i<n;i++) {
			s.add(temp[i]);
		}
		return s;
	}
	
	
	public static ArrayList<String> all_remove(ArrayList<Integer> index,ArrayList<String> s) {
		for(int i=index.size()-1;i>=0;i--) {
			int n=index.get(i);
			s.remove(n);
		}
		return s;
	}//将列表内id全部删除
	
	
	public static ArrayList<Integer> all_index(ArrayList<String> s,String x){
		ArrayList<Integer> all_index=new ArrayList<>();
		if(s.size()==1) {
			all_index.add(0);
			return all_index;
		}
		for(int i=0;i<s.size();i++) {
			if(s.get(i).equals(x)) {
				all_index.add(i);
			}
		}
		
		return all_index;
	}
	
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try {
        	String str=sc.nextLine();
        	str=format(str); //format the cin
        
        	String[] temp=str.split(" ");
        	ArrayList<String> s=to_list(temp);
        	Collections.sort(s);
        
        	int i=0;
        	while(s.size()!=0) {
        		ArrayList<Integer> id=all_index(s, s.get(i));//get id
        		int count=all_index(s, s.get(i)).size();//get amount of id
        		System.out.println(s.get(i)+" "+count);
        		s=all_remove(id,s);
//        		System.out.print(s);
        	
        	}
        }
        finally {
			sc.close();
		}
        
    }
    
}