
public class StringDemo {
	public static void main(String[] args) {
	//	String name;      선언, declaration 값이 아니라 번지가 들어가 있음
	//	name = "한지민";  할당, Assignment 				
	//	String name = "한지민"; //초기화, initialization
	//  System.out.printf("이름=%s\n",name);
	
		String name = new String("한지민"); //생성자
	//	System.out.printf("이름=%s\n",name);
	
	Student jimin = new Student(); //선언 할당
	jimin.hakbun ="20225" ;
	jimin.name ="한지민" ;
	jimin.age= 25;
	jimin.weight=56.4;
	jimin.grade='A';
	jimin.flag= 1<4;
	System.out.print(jimin.flag+" "+jimin.weight+jimin.grade +"\n");
	System.out.printf("%s, %s, %d\n",jimin.hakbun,jimin.name,jimin.age);	

	Student chulsu = new Student();
	chulsu.name="김철수"; //김철수 번지
	chulsu.age = 25;	
	
	Student younghee = new Student();
	younghee.name="이영희"; //이영희 번지
	younghee.age = 25;
	
	System.out.println("김철수 학생 정보");
	System.out.printf("이름 = %s 나이 = %d \n",chulsu.name,chulsu.age);
	System.out.println("이영희 학생 정보");
	System.out.printf("이름 = %s 나이 = %d \n ",younghee.name,younghee.age);
	}
}

