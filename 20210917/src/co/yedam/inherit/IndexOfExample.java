package co.yedam.inherit;

public class IndexOfExample {
	public static void main(String[] args) {
		
		String name = "홍길동";
		System.out.println(name.indexOf("길도"));
		// indexOf("")<여기 안에 들어가는 문자가 있으면 1을,
		// 그렇지 않으면 -1의 값을 반환해줌
		System.out.println(name.equals("길동"));
		// equals > 찾으려는 문자와 name이라는 변수안에 있는 글자가 같으면 true
		// 다르면 false의 값을 반환함

		
		System.out.println(name.indexOf("길도") !=-1);
		System.out.println(name.equals("홍길동"));

	}

}
