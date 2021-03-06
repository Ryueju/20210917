package Friend;



// double val = Double.parseDouble("23.5");
//키 몸무게 쓸 때
import java.util.Scanner;

/*
 * 친구의 목록 관리
 * 친구의 이름,phone,email,키,몸무게
 * 등록, 조회(이름),친구목록,수정,삭제,종료.
 */
public class FriendMain {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] friendList = new Friend[10];
		friendList[0] = new Friend("김유진", "010-1234-5678", "youjin@gamil.com", 158, 50);
		friendList[1] = new Friend("김해준", "010-1534-8608", "sunjun@gamil.com", 178, 60);
		friendList[2] = new Friend("이주연", "010-5034-9671", "nottheboyz@gamil.com", 183, 66);
		friendList[3] = new Friend("이승민", "010-9254-4630", "victorymin@gamil.com", 188, 70);

		while (true) {
			System.out.println("1.친구 등록 2.친구이름 수정 3.친구 목록  4.친구 조회 5.친구 삭제 6.종료");

			int menu = readInt("메뉴를 선택하세요 >>");

			if (menu == 1) {
				System.out.println("친구등록 메뉴입니다.");

				String name = readStr("친구 이름을 입력하세요");
				String phone = readStr("친구 연락처를 입력하세요");
				String email = readStr("친구 메일을 입력하세요");
				int height = readInt("친구 키를 입력하세요");
				int weight = readInt("친구 몸무게를 입력하세요");

				Friend friend = new Friend(name, phone, email, height, weight);

				for (int i = 0; i < friendList.length; i++) {
					if (friendList[i] == null) {
						
							friendList[i] = friend;
							break;
						}
					}
					System.out.println("저장 완료");

				} else if(menu == 2 ) {
					System.out.println("친구 수정 메뉴입니다.");
					
					String search = readStr("수정할 친구이름을 입력하세요");
					String phone = readStr("수정할 연락처를 입력하세요 [ 변경 안하려면 Ent ] ");
					String email = readStr("수정할 email을 입력하세요 [ 변경 안하려면 Ent ] ");
					String height = readStr("변경할 키를 입력하세요[ 변경 안하려면 Ent ] ");
					String weight = readStr("변경할 몸무게를 입력하세요 [ 변경 안하려면 Ent ]");
					boolean isExist = false;
					
					for(int i = 0; i < friendList.length; i++) {
						if(friendList[i] !=null && friendList[i].getName().equals(search)) {
							if(!phone.equals("")) {
								friendList[i].setPhone(phone);
								
							}
							if(!email.equals("")) {
								friendList[i].setEmail(email);
								
							}
							if(!height.equals("")) {
								friendList[i].setHeight(Integer.parseInt(height));
								
							}
							if(!weight.equals("")) {
								friendList[i].setWeight(Integer.parseInt(weight));
								// double val = Double.parseDouble("23.5");

							}
							isExist = true;
						}
				}
					if(isExist)
						System.out.println("정상적으로 수정되었습니다.");
					else
						System.out.println("존재하지 않는 정보입니다.");
			} else if(menu == 3) {
				System.out.println("친구 목록 메뉴입니다.");
				for(Friend friend : friendList) {
					if(friend !=null)
						friend.showInfo();
					
				}
			} else if (menu == 4) {
				System.out.println("친구 조회 목록입니다.");
				String search = readStr("조회할 친구 이름을 입력하세요");
				for (Friend friend : friendList) {
					if(friend !=null && friend.getName().indexOf(search) !=-1)
						friend.showInfo();
					
				}
			} else if(menu == 5) {
				System.out.println("친구 삭제 메뉴입니다.");
			   String search = readStr("삭제할 친구명을 입력하세요");
			   	for(int i = 0; i < friendList.length; i++) {
			   		if (friendList[i] != null && friendList[i].getName().indexOf(search) != -1)
			   			friendList[i] = null;
			   		
			   	}
			   	System.out.println("삭제 완료");
			   	
			} else if( menu == 6) {
				System.out.println("종료.");
				break;
			}

		} //end of while
		System.out.println("끝");
	} //end of main
	
	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
		
		
		
	}
	
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");
			}
		}
		return result;
	}
}