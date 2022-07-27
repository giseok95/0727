
public class OpDemo {
	public static void main(String[] args) {
		// 단항 연산자
// int age =26;
// age++: prefix operator/ ++age: postfix operator
// System.out.println("age: "+age);
// System.out.println("age: "+ ++age); //증가 후 출력
// System.out.println("age: "+age++);  //출력 후 증가
// System.out.println("age: "+age);
		
		//비트 연산자
//		int su=345678;
//		String result = Integer.toBinaryString(su);
//		System.out.println("result="+result);
//		int su1 = ~su;
//		result = Integer.toBinaryString(su1);
//		System.out.println("result="+result);
//		System.out.println("su1="+su1);

		//논리 연산자
//		boolean flag = 4>6;
//		System.out.println("flag="+flag);
//		System.out.println("flag="+!flag);
	
		//Student jimin = new Student();
		
		//형변환, Cast,Convert  늘리는건 알아서 / 줄이는건 강제로
		//1.Cast Up-Promotion, 자동형변환, Implict Conversion 사이즈업
			double result = 5+3.14;  //->5.0+3.14 

		//2.Cast down-Demotion, 강제형변환, Explict Conversion
			int result1= (int)(5+3.14);	 
	}
}
