package ex_240306;
// 추상 클래스로 변경하기. 
// 추상 클래스가 뭐냐? 구성을 추상 메서드를 한개 이상 가지고 있으면, 추상클래스라한다. 
// 추상적이다라고 하는 말은 , 약간 대략적인, 아웃라인, 개요. 
// 반대가 되는 말이 구체적인 뉘앙스. 
// 추상 메서드 뭐냐?  메서드 의 기본 구성 1) 선언부 2) 구현체(몸통) 으로 구성이되는데 여기서, 2번 빠진 메서드.
// 즉 예 ) abstract 키워드 를 사용하고, 
// abstract public void introduceAlbum ()

// 해당 클래스 속성(변수)에는
// 1) 그룹 명. 
// 2) 그룹 인원 -> 멤버의 배열 크기로 대체 
// 3) 그룹원의 이름. 
// 4) 앨범들 중에서, 몇개만 넣을 예정. 

// 기능
// 1) 소개하는 기능( 그룹이름으로)
// 2) 그룹원의 이름을 소개하는 기능.
// 3) 앨범 이름 소개하는 기능. 
// 
// 추상 메서드를 추가. 
// 4) 활동하는 지역을 알려주는 기능. 

// 기존 클래스 -> 추상 클래스로 변경함. 

// 인스턴스, 예) BTS, 블랙핑크 
abstract public class Idol_abstract {
	public String groupName;
//	public int groupNumber;
	// 해당 멤버를 받는 배열의 크리고 대체.
	public String[] groupMembers;
	public String[] groupAlbums;

	
	// 오버로드 ? 넘치게 적재하다.(직역)
	// 생성자, 메서드 에서, 매개변수 부분의 정의 부분에서, 
	// 타입을 다른것을 말합니다.
	// 이름은 동일하지만, 매개변수 정의 부분을 다르게 정의하는 것을 말합니다. 
	
	
	// 매개변수를 3개인 생성자를 만들면 됨.
	// 디폴트 생성자를 어떻게 할까요? 안만들고, 바로 3개짜리 생성자만 이용하겠습니다.

	public Idol_abstract(String groupName, String[] groupMembers, String[] groupAlbums) {
		// 생성자 호출시, 넘겨받은 매개변수들을 ,
		// 원래의 인스턴스의 값으로 저장 했다. (표현),
		this.groupName = groupName;
		this.groupMembers = groupMembers;
		this.groupAlbums = groupAlbums;
		
		// 인스턴스 생성시, 바로 인사하기. 
		System.out.println("안녕하세요, 아이돌 " + groupName + "입니다.^^");
	}

	// 인스턴스 메서드라고 합니다.
	// 기존에 앞에서 사용했던, static을 이용해서, 만들었던 클래스 메서드와 비교대는 부분.
	// 이 메서드는, 인스턴스를 만들고 나서, 사용이 가능합니다.
	public void introduceMember() {
		for(String member : this.groupMembers) {
			System.out.println("멤버의 " + member + "입니다.");
		}
	}

	public void introduceAlbum() {
		for(String album : this.groupAlbums ) {
			System.out.println("부모 메서드의 기능: 앨범으로  " + album + "있습니다.");
		}
	}
	
	abstract public void introduceActivityArea() ;

}
