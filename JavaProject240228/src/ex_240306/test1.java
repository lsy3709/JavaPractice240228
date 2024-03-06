package ex_240306;

public interface test1 extends test2, test3 {
	// class A extends B
	// 인터페이스 구성품 
		// 1) 상수 2) 추상 메소드
		String SNACK_MENU = "자갈치";
		void showSnackMenu();
}
