import java.util.*;

public class Main{
	public static void main(String args[]) {
		double w, h;
		Rectangle r;
		Perimeter p;
		Scanner in=new Scanner(System.in);
		w=in.nextDouble();
		h=in.nextDouble();
		
		r=new Rectangle(w, h);
		p=r;
		System.out.printf("%.2f\n",r.getArea());
		System.out.printf("%.2f\n",p.getPerimeter());
	}	
	
}


interface Area{
	double getArea();
}

interface Perimeter{
	double getPerimeter();
}

class Rectangle implements Area,Perimeter{
	private double width,height;
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
		// TODO 自动生成的构造函数存根
	}
	
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}

	@Override
	public double getPerimeter() {
		// TODO 自动生成的方法存根
		return 2*width+2*height;
	}

	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		return width*height;
	}
	
}