package miniProject;

public class Student1 extends LunchMenu {
	public Student1() {}

	@Override
       int total() {
		 int price = Price.RICE+Price.BULGOGI+Price.BANANA;
		 return price;
	}
}
