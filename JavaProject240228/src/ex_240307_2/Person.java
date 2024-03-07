package ex_240307_2;

public class Person {
	public String name;
	public int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	// toString 정의하면, 해당 인스턴스를 출력시
	// 재정의한 문자열이 옵니다. 
	// 주의사항.
	// 모든 클래스는 Object 클래스 상속 받았다. 
	// 상속 받은 클래스 Person 은, Object의 멤버, 메서드를 모두 가지고 있다. 
	// toString() Object의 메서드, 객체를 문자열로 변환을 해주는 기능. 
	// 그대로 사용 안함. 
	// 왜? 실제로 데이터를 비교하지, 객체의 메모리 위치 주솟값을 비교 안함. 
	// 재정의 하면, 부모에도 toString(), 자식에도 toString()가 있어요.
	// 누가 더 우선이냐? 자식이 우선이다. (가상메서드)
	public String toString() {
		return "제이름 : " + this.name + ", 나이 : " + this.age + "입니다.";
	}
	// 2번째, equals는 Object에도 있지만, 객체를 비교해서 많이 사용 안한다. 
	// 그래서, 재정의를 하고, 우리는 이름이 같으면 같다고 가정하고 재정의한다. 
	
//	public boolean equals(Object obj) {
//	Person p= (Person)obj;
	// 문자열 비교하는 것 같이 설명하고 안내하기. 
//	if(p.name equals(obj))
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("이상용1",41);
		Person person2 = new Person("이상용2",41);
		
		System.out.println("person1 hashCode: "+ person1.hashCode());
		System.out.println("person2 hashCode: "+ person2.hashCode());
		System.out.println("person1 toString: "+ person1.toString());
		System.out.println("person2 toString: "+ person2.toString());
		// 실제 데이터를 이용해서 작업을함. 
		// 비지니스 로직, 데이터가지고 작업을 하지. 
		// 메모리 위치의 주솟값 같은지 여부가 그리크게 
		// 중요하지 않습니다. 자바에서는 왜? 
		// 왜? 메모리 관리를 누가 하죠? 시스템이 해서. !
		
	}

}
