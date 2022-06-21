package lunch_menu;

public class Main {
	public static void main(String[] args) {
		Student1 stu1 = new Student1();
		Student2 stu2 = new Student2();
		
		System.out.println("학생1이 지불할 가격은 "+stu1.total()+"원 입니다.");
		System.out.println("학생2이 지불할 가격은 "+stu2.total()+"원 입니다.");
	}
}
