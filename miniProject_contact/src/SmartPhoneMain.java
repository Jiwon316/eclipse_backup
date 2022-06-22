import java.util.Scanner;
public class SmartPhoneMain {

	public static void main(String[] args) {
	SmartPhone sp = new SmartPhone();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("#데이터 2개를 입력합니다.");
	sp.addContactData(sp.inputContactData());
	sp.addContactData(sp.inputContactData());
	
	printMenu();
	do {
		int menu = sc.nextInt();
		if (menu == 1) {
			System.out.println("**연락처 등록**");
			sp.addContactData(sp.inputContactData());
			System.out.println();
		} else if (menu == 2) {
			System.out.println("**모든 연락처 출력**");
			sp.printAllContact();
			System.out.println();
		} else if (menu == 3) {
			System.out.println("**연락처 검색**");

			System.out.println();
		} else if (menu == 4) {
			System.out.println("**연락처 삭제**");

			System.out.println();
		} else if (menu == 5) {
			System.out.println("**연락처 수정**");

			System.out.println();
		} else if (menu == 6) {
			break;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		printMenu();
	} while (sc.nextInt() != 6);
	System.out.println("프로그램을 종료합니다.");
}
	
	//메뉴 번호 입력하는대로 연결이 안 됨 왜지...

	static void printMenu() { 
		
		System.out.println("Contact-------------------");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 모든 연락처 출력");
		System.out.println(">> 3. 연락처 검색");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 수정");
		System.out.println(">> 6. 프로그램 종료");
		System.out.println("--------------------------");
		System.out.print("몇 번 메뉴를 실행할까요? : ");
	}
}
