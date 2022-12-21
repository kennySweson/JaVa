import java.util.*;
public class Main{
	public static void main(String args[]) {
		double a,area;
		Square sq;
		Scanner reader=new Scanner(System.in);
		a=reader.nextDouble();
		/*以缺省方式创建Square对象*/
		sq=new Square();
		/*调用Square对象的getArea方法，返回值存放在area中*/
		area=sq.getArea();
		System.out.printf("%.1f\n",area);
		/*以带参数a的方式创建Square对象*/
		sq=new Square(a);
		System.out.printf("%.1f\n",sq.getArea());
	}    
}

class Square{
	double length;
	/*带一个参数的构造方法*/
	public Square(double l) {
		length=l;
		// TODO 自动生成的构造函数存根
	}

	/*缺省构造方法，即不带参数的构造方法，将length值设置为1.0*/
	public Square() {
		length=1;
	}


	/*公共方法getArea，返回正方形面积*/
	double getArea() {
		return length*length;
	}
}