package ex_240304;

public class Circle { // extends Object 라는 말이 없지만, 생략이 되어 있음. 
	private int radius;
	private String name;
	private int price;
	private final static Double PI = 3.14; 
	
	// 기본 생성자 만들기 
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle(int radius, String name) {
		// 모든 클래스는 암묵적으로 , Object 라는 클래스를 상속 받고 있다. 
		// 자식 클래스는 반드시 , 부모 클래스가 초기화가 되고 나서, 사용이 가능함. 
		// super() 로 부모클래스를 초기화를 했다.(생성자 호출)
		super(); // 앞에서는 생략하고 사용 했음. 
		this.radius = radius;
		this.name = name;
	}

	public Circle(int radius, String name, int price) {
		this(radius,name);
//		this.radius = radius;
//		this.name = name;
		this.price = price;
	}

	// 매개변수2개인 생성자도 만들기. 
	
	// 멤버가 private 라서, 현재 게터 함수를 이용해서, 해당 필드에 값 접근함. 
	public int getRadius() {
		return radius;
	}
	// 멤버가 private 라서, 현재 set 함수를 이용해서, 해당 필드에 값 설정함.
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		
	// 기능1, 면적 구하기
	public void calcGetArea() {
		System.out.println("원의 넓이: " + this.radius*this.radius*PI);
		
	}
	// 기능2, 이름, 크기, 면적 알려주는 기능. 
	public void showInfo() {
		
		System.out.println("이름 : " + this.name+ ", 크기 : " + this.radius +", 원의 넓이: " + this.radius*this.radius*PI);
	}
	// callByValue 예제 
	public void increase(int n ) {
		n = n+1;
		// 지역변수, 해당 메서드에서 호출이 되었을 때, 변수가 있다가, 
		// 메서드 실행이 끝나면, 소멸한다. 
		System.out.println("지역 변수 n : " + n);
		
	}
	
	// 클래스의 필드에 접근 지정자를 private 로 해서, 외부에서 접근이 안되는 부분 확인하고, 
	// getter/setter, 지금은 수동으로 만들어서 사용하지만, 
	// 1) 시스템에서, 반자동으로 만들어서 사용하는 방법
	
	// 2) 라이브러리, lombok 외부로 완전히 분리해서, 시스템이 동작하면, 자동으로 생성해줌. 
	// 결론, 1)번으로 반자동으로 연습하고, 
	// 나중에 프레임워크 들어가면, 그 때 라이브러리 설치해서 이용하시면 됩니다. 편합니다. !!추천. !!
	
	// 따로 접근해서, 1) 값을 설정 하는 방법 , 2) 값을 가지고 오는 방법. 
	
	
}



