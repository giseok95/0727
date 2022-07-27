
public class CopyDemo1 {
	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.price =25_000_000;
		
		Car matiz = new Car();
		matiz.price=sonata.price; //값복사
		
		System.out.println("Before");
		System.out.println("sonata's value= "+sonata.price);
		System.out.println("matiz's value= "+matiz.price);
	
		System.out.println("After");
		sonata.price=100_000_000;
		System.out.println("matiz's value= "+matiz.price);
		System.out.println("matiz's value= "+matiz.price);
		
	}
}

class Car{
	int price;
}