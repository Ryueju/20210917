package Friend;



// double val = Double.parseDouble("23.5");
//Ű ������ �� ��
import java.util.Scanner;

/*
 * ģ���� ��� ����
 * ģ���� �̸�,phone,email,Ű,������
 * ���, ��ȸ(�̸�),ģ�����,����,����,����.
 */
public class FriendMain {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] friendList = new Friend[10];
		friendList[0] = new Friend("������", "010-1234-5678", "youjin@gamil.com", 158, 50);
		friendList[1] = new Friend("������", "010-1534-8608", "sunjun@gamil.com", 178, 60);
		friendList[2] = new Friend("���ֿ�", "010-5034-9671", "nottheboyz@gamil.com", 183, 66);
		friendList[3] = new Friend("�̽¹�", "010-9254-4630", "victorymin@gamil.com", 188, 70);

		while (true) {
			System.out.println("1.ģ�� ��� 2.ģ���̸� ���� 3.ģ�� ���  4.ģ�� ��ȸ 5.ģ�� ���� 6.����");

			int menu = readInt("�޴��� �����ϼ��� >>");

			if (menu == 1) {
				System.out.println("ģ����� �޴��Դϴ�.");

				String name = readStr("ģ�� �̸��� �Է��ϼ���");
				String phone = readStr("ģ�� ����ó�� �Է��ϼ���");
				String email = readStr("ģ�� ������ �Է��ϼ���");
				int height = readInt("ģ�� Ű�� �Է��ϼ���");
				int weight = readInt("ģ�� �����Ը� �Է��ϼ���");

				Friend friend = new Friend(name, phone, email, height, weight);

				for (int i = 0; i < friendList.length; i++) {
					if (friendList[i] == null) {
						
							friendList[i] = friend;
							break;
						}
					}
					System.out.println("���� �Ϸ�");

				} else if(menu == 2 ) {
					System.out.println("ģ�� ���� �޴��Դϴ�.");
					
					String search = readStr("������ ģ���̸��� �Է��ϼ���");
					String phone = readStr("������ ����ó�� �Է��ϼ��� [ ���� ���Ϸ��� Ent ] ");
					String email = readStr("������ email�� �Է��ϼ��� [ ���� ���Ϸ��� Ent ] ");
					String height = readStr("������ Ű�� �Է��ϼ���[ ���� ���Ϸ��� Ent ] ");
					String weight = readStr("������ �����Ը� �Է��ϼ��� [ ���� ���Ϸ��� Ent ]");
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
						System.out.println("���������� �����Ǿ����ϴ�.");
					else
						System.out.println("�������� �ʴ� �����Դϴ�.");
			} else if(menu == 3) {
				System.out.println("ģ�� ��� �޴��Դϴ�.");
				for(Friend friend : friendList) {
					if(friend !=null)
						friend.showInfo();
					
				}
			} else if (menu == 4) {
				System.out.println("ģ�� ��ȸ ����Դϴ�.");
				String search = readStr("��ȸ�� ģ�� �̸��� �Է��ϼ���");
				for (Friend friend : friendList) {
					if(friend !=null && friend.getName().indexOf(search) !=-1)
						friend.showInfo();
					
				}
			} else if(menu == 5) {
				System.out.println("ģ�� ���� �޴��Դϴ�.");
			   String search = readStr("������ ģ������ �Է��ϼ���");
			   	for(int i = 0; i < friendList.length; i++) {
			   		if (friendList[i] != null && friendList[i].getName().indexOf(search) != -1)
			   			friendList[i] = null;
			   		
			   	}
			   	System.out.println("���� �Ϸ�");
			   	
			} else if( menu == 6) {
				System.out.println("����.");
				break;
			}

		} //end of while
		System.out.println("��");
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
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		return result;
	}
}