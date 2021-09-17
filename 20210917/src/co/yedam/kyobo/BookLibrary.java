package co.yedam.kyobo;

import java.util.Scanner;

/*
 * 1.도서 등록 2.도서 수정 3.도서 목록 4. 도서 조회 5.도서 삭제
 * 도서정보: 도서제목 / 저자 / 출판사 / 가격...클래스.
 */
public class BookLibrary {
	static Scanner scn = new Scanner(System.in);

	// 키보드를 읽어서 스캔해줌
	public static void main(String[] args) {
		Book[] kyoboLib = new Book[100];
		kyoboLib[0] = new Book("혼자 공부하는 자바", "신용권", "한빛출판사", 25000);
		kyoboLib[1] = new Book("죽고 싶지만 떡볶이는 먹고싶어", "백세희", "손출판사", 15000);
		kyoboLib[2] = new Book("이것이 자바다", "신용권", "한빛출판사", 20000);
		kyoboLib[3] = new Book("혼자 공부하는 도둑질", "홍길동", "우리출판사", 35000);

		while (true) {
			System.out.println("1.도서등록 2.도서수정 3. 도서목록 4.도서조회 5.도서삭제 6.종료");

			int menu = readInt("메뉴를 선택하세요>>");

			if (menu == 1) {
				System.out.println("도서등록 메뉴입니다.");
				// 도서등록 : 제목, 저자, 출판사, 가격
				String title = readStr("책 제목을 입력하세요.");
				String auth = readStr("저자를 입력하세요.");
				String press = readStr("출판사를 입력하세요");
				int price = readInt("가격을 입력하세요");
				
				
				
				
				Book book = new Book(title, auth, press, price);
				
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] == null) {
						kyoboLib[i] = book;
						break;
					}
				}
				System.out.println("저장 완료.");

			} else if (menu == 2) {
				System.out.println("도서수정 메뉴입니다.");
				//도서명으로 찾아와서 => 도서명(키의 역할을 함)
				//저자, 출판사, 가격 => 항목변경.
				//정확한이름을입력해갸지고..
				String search = readStr("수정할 도서명을 입력하세용"); //"" <null은아니지만 값이 없는 상태
				String author = readStr("변경할 저자를 입력하세용[변경 안하려면 Ent]");
				String press = readStr("변경할 출판사를 입력하세요[변경 안하려면 Ent]");
				String price = readStr("변경할 금액을 입력하세요[변경 안하려면 Ent]");
				boolean isExist = false;
				
				for(int i = 0; i < kyoboLib.length; i++) {
					//한 건 찾아온 경우
					if(kyoboLib[i] !=null && kyoboLib[i].getTitle().equals(search)) {
						if(!author.equals("")) {
							kyoboLib[i].setAuthor(author);
							
						}
						if(!press.equals("")) {
							kyoboLib[i].setPress(press);
						}
						if(!price.equals("")) {
							kyoboLib[i].setPrice(Integer.parseInt(price));
												//가격이라 Integer.parseInt(price)로 써줌
						
						}
						isExist = true;
					}
				}
				if(isExist)
					System.out.println("정상적으로 수정되었습니다.");
				else 
					System.out.println("존재하지 않는 책입니다.");

			} else if (menu == 3) {
				System.out.println("도서목록 메뉴입니다.");
				for (Book book : kyoboLib) {
					if (book != null)
						book.showInfo();
				}

			} else if (menu == 4) {
				System.out.println("도서조회 메뉴입니다.");
				String search = readStr("조회할 도서명을 입력하세요");
				for (Book book : kyoboLib) { // -1 : 값이 있다는 뜻
					if (book != null && book.getTitle().indexOf(search) != -1)
						book.showInfo();
				}
			} else if (menu == 5) {
				System.out.println("도서삭제 메뉴입니다.");
				String search = readStr("삭제할 도서명을 입력하세요");
				for (int i = 0; i < kyoboLib.length; i++) { // -1 : 값이 있다는 뜻
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().indexOf(search) != -1)
						kyoboLib[i] = null; // 원래 값에서 null을 추가해주면 삭제됨
							//배열을 지워주는게 아니라 불러온 값을 지워주는 것임
				}
				System.out.println("삭제 완료");
			} else if (menu == 6) {
				System.out.println("종료.");
				break;

			}
		} // end of while
		System.out.println("끝");
	}// end of main

	// 사용자 입력값을 반환해주는 메시지.(return;~필요)
	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();

	}

	// 사용자 입력값을 반환(int).
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val); // "1000" -> 1000
				break;

			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");

			}
		}
		return result;
	}
}
