package Class;

public class Dog extends Animal{
	public void sound() {
		System.out.println("Dog's sound");
	}
	
	public static void main(String[] args) {
		Animal a=new Animal();
		Dog d=new Dog();
		a.sound();
		d.sound();
	}
}
