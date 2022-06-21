package lunch_menu;

public class Student2 extends LunchMenu {
	public Student2() {}
	
	@Override
	 int total() {
		int price = Price.RICE+Price.BULGOGI+Price.ALMOND + Price.MILK;
		return price;
	
	}


}
