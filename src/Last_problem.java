import java.util.Scanner;

public class Last_problem {
	public static void main(String[] args) {
        Rectangle r1,r2,r3;
        int x,y;
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        r1=new Rectangle();
        r2=new Rectangle(2,2);
        r3=new Rectangle(2,-2);
        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        r2.setWidth(-1);
        r2.setHeight(3);
        System.out.println(r2.getPerimeter());
        System.out.println(r2.getArea());
        if(Rectangle.color==Color.black)
            System.out.println("black");
        else
            System.out.println("others");
        System.out.println(r3.show());
        Rectangle.color=Color.yellow;
         if(Rectangle.color==Color.black)
            System.out.println("black");
        else
            System.out.println("others");       
        r3.move(x, y);
        System.out.println(r3.show());
    }
	class Rectangle{
		
	}
}
