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
				while((c = in.read()) != -1) {
					System.out.print((char)c);
				}
				in.close();
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





