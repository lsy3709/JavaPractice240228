package ex_240314;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex_01_FileIO_String_1 {

	public static void main(String[] args) {
		
		// FileReader , 문자를 읽을 때 사용하는 도구. 선언만 했음. 
		FileReader in = null;
		// try catch 강제성으로 컴파일러가 잡는다. 
		// 없이 읽으려고 했을 때, 컴파일러 예외에 잡히고, 
		// 퀵 수정으로 , try catch 구문을 자동으로 잡는 부분, 
		try {
			// 파일을 읽는 도구. 읽은 내용을 메모리 에 담아두었다. 
			in = new FileReader("c:\\windows\\system.ini");
			int c; 
			try {
				// in.read() 읽으면, 문자를 유니코드 정수로 반환을 함. 
				// 내용이 있다면, 반환되는 정수값이 음이 아니예요. 참, 그래서 계속 읽고, 출력. 
				// 만약, 읽을 내용이 없다면, 반환을 -1 하고, 반복 종료.
				while((c = in.read()) != -1) {
					System.out.print((char)c);
				}
				// 사용후 메모리 반납(해당 인스턴스라는게, 힙의 메모리 위치 어딘가에 저장). 
				in.close();
				// 누가 알아서 수거해가죠? 가비지 컬렉터 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}





