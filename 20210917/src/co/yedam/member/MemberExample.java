package co.yedam.member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1 ", " 박미림 ", "대구 중구 내일동 "); //생성자 호출하는 것
		//필드를 채우는데 쓰는 생성자
		
		m1.showInfo();
//		m1.memberId = "user1";
		m1.setMemberId("user1"); //이 메소드를 통해서 
//		m1.name = "Hong";
		m1.setName("Hong");
//		m1.address = "대구 중구 남일동";
		m1.setAddress("대구 중구 남일동");
		
//		System.out.println("아이디 : " + m1.memberId);
		System.out.println("아이디 : " + m1.getMemberId());
//		System.out.println("이름 : " + m1.name);
		System.out.println("이름 : " + m1.getName());
//		System.out.println("주소 : " + m1.address);
		System.out.println("주소 : " + m1.getAddress());
		
		Member m2 = new Member("user2", "류이주","대구 달서구 감삼동");
		m2.showInfo();
		m2.setName("류이주");
		m2.setAddress("대구 달서구 감삼동");
		
		Member m3 = new Member("user3 ", "홍길동", "대구 중구 남일동");
		m3.showInfo();
	//	m3.name = "박길동";
		m3.setName("박길동");		
		m3.showInfo(); //이렇게 이름을 바꿀수도 있음!
		
		
		//이렇게 해도되지만 라인이 세개가 필요해서 위의 방법을사용하는 것임
		//생성자를 형성해서 채워주는 연습하기
		
	}
	
	

}
