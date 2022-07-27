import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee em= new Employee();
		
		System.out.print("사원번호: ");
		em.empno=sc.nextInt();
		sc.nextLine();
		
		System.out.print("사원이름: ");
		em.ename=sc.nextLine();
	
		
		System.out.print("사원나이: ");
		em.birthyear=sc.nextInt();
		
		System.out.print("사원월급: ");
		em.salary=sc.nextInt();
		
		sc.nextLine();
		System.out.print("사원이메일: ");
		em.email=sc.nextLine();
		
		System.out.print("사원전화번호: ");
		em.tel=sc.nextInt();
	
		
		System.out.print("정규직: ");
		em.flag=sc.nextBoolean();
		
		System.out.println("사원번호: "+em.empno);
		System.out.println("사원이름: "+em.ename);
		System.out.println("사원나이: "+em.birthyear);
		System.out.println("사원월급: "+em.salary);
		System.out.println("사원이메일: "+em.email);
		System.out.println("사원전화번호: "+em.tel);
		System.out.println("정규직: "+em.flag);
	}
}
class Employee{
		int empno;
		String ename;
		int birthyear;
		int salary;
		String email;
		int tel;
		boolean flag;	
		
 }
