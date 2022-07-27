
public class HelloWorld1 {
	String str = "Hello World";
	
	public static void main(String[] args) {
		//Local Variable 지역변수
		//Stiring str = "Hello World";
		//Stiring str - 지역변수는 사용하기 전에 초기화를 해줘야 된다. 
		//int age;
	
		HelloWorld1 hw = new HelloWorld1();
		System.out.println("str="+hw.str );
	}	
}
