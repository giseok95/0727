
public class HelloWorld8 {
	public static void main(String[] args) {
		Seoul.display();
		Daegu.display();
	}
}

class Seoul{
	static void display() { //Static method or Class method
		System.out.println("Hello World");
	}
}

class Daegu{
	static void display() { //Static method or Class method
		System.out.println("μλ μΈκ³");
	}
}
