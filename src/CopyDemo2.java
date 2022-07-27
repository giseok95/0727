
public class CopyDemo2 {
	public static void main(String[] args) {
		Product mouse = new Product();
		mouse.price= 20000;
		Product keyboard = mouse; //주소복사
		
		System.out.println("Before");
		System.out.println("mouse's value= "+mouse.price);
		System.out.println("keyboard's value= "+keyboard.price);
	

		System.out.println("After");
		mouse.price = 100000;
		System.out.println("mouse's value= "+mouse.price);
		System.out.println("keyboard's value= "+keyboard.price);
	}
}
class Product{
	int price;
}
