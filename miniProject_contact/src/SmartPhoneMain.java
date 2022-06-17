import java.util.Scanner;
public class SmartPhoneMain {

	public static void main(String[] args) {
	SmartPhone sp = new SmartPhone();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("#데이터 2개를 입력합니다.");
	sp.addContactData(sp.inputContactData());
	sp.addContactData(sp.inputContactData());
	
//	printMenu();
//	
//	while(printMenu()!=6) {
//		switch(printMenu()) {
//		case 1:
//			sp.addContactData(sp.inputContactData());
//			System.out.println();
//		
//		case 2:
//			sp.printAllContact(); 
//			System.out.println();
//		
//		case 3:
//			System.out.println("이름을 입력하세요.");
//			String searchName = sc.next();
//			sp.searchContact(searchName);
//			System.out.println();
//		
//		case 4:
//			System.out.println("이름을 입력하세요.");
//			String deleteName = sc.next();
//			sp.deleteContact(deleteName);
//			System.out.println();
//		
//		case 5:
			System.out.println("이름을 입력하세요.");
			String editName = sc.next();
			Contact newContact = new Contact();
			sp.editContact(editName, newContact);
			System.out.println();
//			
//		case 6:
//			break;
//			
//		default:		
//			System.out.println("잘못 입력하셨습니다.");
//			System.out.println();
//		}
//	}
//	System.out.println("프로그램을 종료합니다.");
//	
	}

	static int printMenu() { 
		
		System.out.println("Contact-------------------");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 모든 연락처 출력");
		System.out.println(">> 3. 연락처 검색");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 수정");
		System.out.println(">> 6. 프로그램 종료");
		System.out.println("--------------------------");
		System.out.print("몇 번 메뉴를 실행할까요? : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
}
