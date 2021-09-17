package co.yedam;

//0917 array 예제
public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = {1,2,3};
		//배열타입의 정수를 선언함
		String[] strAry = {"Hello","World"};
		//문자열을담을수있는 배열이다
		int num = 10;
		
//		Student s1; //값이 할당 안된 상태
		Student s1 = new Student(); //name, score 필드를 넣을 수 있게됨
		s1.name = "홍길동"; // s1이라는 필드에 홍길동을 넣겠다.
		s1.score = 80;
		
		Student s2 = new Student();
		//새롭게 name과score를 저장할수 있게됨
		s2.name = "김민수";
		s2.score = 90;
		
		System.out.println("s1학생이름: "  + s1.name);
		System.out.println("s1학생점수: "  + s1.score);
		
		Student s3 = new Student();
		s3.name = "최지우";
		s3.score = 85;
		
		Student[] students = {s1, s2, s3};
				//student타입의 데이터를 여러 건담을 수 있는 배열
		System.out.println("배열 첫번째의 이름 : " + students[0].name	);
													//=s1과 같음
		System.out.println("배열 첫번째의 점수 : " + students[0].score);
		
		
		System.out.println("배열 두번째의 이름 : " + students[2].name	);
													//=s2과 같음
		System.out.println("배열 두번째의 점수 : " + students[2].score);
		
		
		s1.name  = "박길동";
		s2.score = 70;
		//바뀐 값이 된다.
		
		for(int i=0; i<students.length; i++) {
			System.out.println("학생이름: " + students[i].name);
			System.out.println("학생점수: " + students[i].score);

		}
			
	}
}
