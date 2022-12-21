//import java.awt.Color;
//import java.awt.Point;
//import java.util.Scanner;
//
//public class Last_problem {
//	public static void main(String[] args) {
//        Rectangle r1,r2,r3;
//        int x,y;
//        Scanner in=new Scanner(System.in);
//        x=in.nextInt();
//        y=in.nextInt();
//        r1=new Rectangle();
//        r2=new Rectangle(2,2);
//        r3=new Rectangle(2,-2);
//        System.out.println(r1.getWidth());
//        System.out.println(r1.getHeight());
//        r2.setWidth(-1);
//        r2.setHeight(3);
//        System.out.println(r2.getPerimeter());
//        System.out.println(r2.getArea());
//        if(Rectangle.color==Color.black)
//            System.out.println("black");
//        else
//            System.out.println("others");
//        System.out.println(r3.show());
//        Rectangle.color=Color.yellow;
//         if(Rectangle.color==Color.black)
//            System.out.println("black");
//        else
//            System.out.println("others");       
//        r3.move(x, y);
//        System.out.println(r3.show());
//    }
//	
//	
//}
//
//class Rectangle{
//	public int width=1;
//	private int height=1;
//	public static Color color=Color.black;
//	private double x=0.0;
//	private double y=0.0;
//	
//	public Rectangle() {
//		// TODO 自动生成的构造函数存根
//		
//		
//	}
//	
//	public Rectangle(int width,int height) {
//		if(width<=0) {
//			width=1;
//		}
//		if(height<0) {
//			height=1;
//		}
//		this.width=width;
//		this.height=height;
//		
//	}
//	
//	public int getWidth() {
//		return width;
//	}
//	public void setWidth(int width) {
//		if(width<=0) {
//			return;
//		}
//		else {
//			this.width = width;
//		}
//		
//	}
//	
//	
//	public int getHeight() {
//		return height;
//	}
//	public void setHeight(int height) {
//		if(height<=0) {
//			return;
//		}
//		else {
//			this.height = height;
//		}
//	}
//	
//		
//	public int getPerimeter() {
//		return 2*this.height+2*this.width;
//	}
//	
//	public int getArea() {
//		return this.width*this.height;
//	}
//	
//	
//	public void move(double x,double y) {
//		this.x=x;
//		this.y=y;
//	}
//	
//	public String show() {
//		String s=new String("location:("+this.x+","+this.y+")");
//		return s;
//	}
//	
//	
//}
