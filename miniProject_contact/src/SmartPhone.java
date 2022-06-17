
import java.util.Scanner;

public class SmartPhone {
	Contact contact = new Contact();
	static Contact[] c = new Contact[10];

	public Contact inputContactData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("전화번호 : ");
		String number = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("주소 : ");
		String address = sc.next();
		System.out.print("생일 : ");
		String birthDate = sc.next();
		System.out.print("그룹 : ");
		String group = sc.next();

		return new Contact(name, number, email, address, birthDate, group);
	}

	public void addContactData(Contact contact) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] == null) {
				c[i] = contact;
				System.out.printf(">>데이터가 저장되었습니다 (%d) \n", i + 1);
				break;
			}
		}
	}

	public void printContact(Contact contact) {
		contact.printInfo();
	}

	public void printAllContact() {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {
				System.out.println("--------------------");
				printContact(c[i]);
			} else {
				break;
			}
		}
	}

	public void searchContact(String name) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {
				if (c[i].getName().equals(name)) {
					printContact(c[i]);
				} // else {
					// System.out.println("일치하는 정보가 없습니다.");
					// }
			}

		}
	}

	public void deleteContact(String name) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {
				if (c[i].getName().equals(name)) {
				System.arraycopy(c, i + 1, c, i, (c.length - i + 1));
				c[9] = null;
			}// else {
//				System.out.println("일치하는 정보가 없습니다.");
//			}
			}
		}
	}

	public void editContact(String name, Contact newContact) {
		inputContactData();
		for (int i = 0; i < c.length; i++) {
			if (c[i].getName().equals(name)) {
				newContact = c[i];
			} //else {
				//System.out.println("일치하는 정보가 없습니다.");
			//}
		}
	}
}