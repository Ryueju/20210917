package co.yedam.member;

public class Member {
	// user1(아이디), 홍길동(이름), 대구 중구 신당동(주소)

	private String memberId;
	// public : member라는 클래스 이 외에 다른 클래스에서 사용하도록 오픈
	// private : member클래서 외에 사용하지 못하게 숨길겡
	private String name;
	private String address;

	// 생성자 : 필들에 값을 초기화 함.
	public Member() { // member라는 생성자에다가...
//		memberId = "user1";
//		name = "박지원";
//		address = "대구 중구 내일동";
	}

	public Member(String mId) {
		memberId = mId;
		// memberId에 있는 값을 넣어주는 생성자를 생성.

	}

	public Member(String mId, String n, String a) {
		memberId = mId;
		name = n;
		address = a;
	}

	public void setMemberId(String mId) {
		memberId = mId; // 위의 memberId필드를 의미함

	}

	public void setName(String n) {
		name = n; // setName이라는 메소드를 n필드에다가 채울게

	}

	public void setAddress(String a) {
		address = a;
	}

	public String getMemberId() {
		return memberId;
		// memberId를 리턴하도록 하겠다..
	}

	public String getName() {
		return name; //반환해주는 필드 : 이름

	}

	public String getAddress() {
		return address; // 반환해주는 필드 : 주소

	}

	public void showInfo() {
		System.out.println("아이디 : " + memberId + " , 이름 : " + name + ", 주소 : " + address);
	}

	public void showName() {
		System.out.println("이름 : " + name);
	}

	public void showAddress() {
		System.out.println("주소 : " + address);

	}

}
