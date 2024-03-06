package ex_240304;

public class Shape {
	private String name;
	// 접근 지정자 생략하면, default 
	// 같은 패키지 내부에서 접근이 가능함. 
	String color; 
	// 상속 받은 자식 클래스에서 만 접근이 가능함. 
	protected int edgePoint;

}
