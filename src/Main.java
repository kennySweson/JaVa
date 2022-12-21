import java.util.*;
public class Main{
	public static void main(String args[]) {
		double w,h;
		Rectangle r;
		Square s;
		Scanner in=new Scanner(System.in);
		w=in.nextDouble();
		h=in.nextDouble();
		//根据运行结果，创建合适的对象；
		r=new Rectangle(w, h);
		System.out.printf("%.2f\n",r.getArea());  //15.00
		//创建合适的对象；
		s=new Square(w);
		System.out.printf("%.2f\n",s.getArea());  //25.00
		System.out.printf("%.2f\n",s.getLength());  //5.00
		//创建合适的对象；
		r=new Rectangle(h, h);
		System.out.printf("%.2f\n",r.getArea());  //9.00
	}
}
class Rectangle{
	private double width,height;
	Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	double getArea(){
		return width*height;
	}
	double getWidth(){
		return width;
	}
	double getHeight(){
		return height;
	}
}

class Square extends Rectangle{
	private static double length;
	public Square(double l) {
		super(l, l);
		this.length=l;
		// TODO 自动生成的构造函数存根
	}
	
	public double getLength() {
		return length;
	}
	
}