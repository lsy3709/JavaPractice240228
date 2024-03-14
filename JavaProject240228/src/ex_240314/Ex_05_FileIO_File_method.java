package ex_240314;

import java.io.File;
import java.io.FileInputStream;

public class Ex_05_FileIO_File_method {

	// 해당 디렉토리의 정보를 조회를 할려면, 반드시 , 해당 폴더의 경로를 알아야한다. 
	// 앞에서, 경로를 절대 경로를 문자열 계속 전달했고, 
	// 이제는 File 클래스에 경로를 담아서 매개변수에 정의.
	// 그러면, 궁금한 폴더 경로의 File 인스턴스만 전달하면, 해당 File 인스턴스로 
	// 정보등을 조회가 가능하다. 
	public static void listDirectory(File dir) {
		System.out.println("입력된 dir 의 정보 조회 메서드===============");
		System.out.println("File dir의 인스턴스의 기능중에서 getPath() : " + dir.getParent());
		// listFiles(), 본인 폴더 및 하위 폴더 등의 정보를 File 타입으로 배열로 리턴. 
		File [] subFiles = dir.listFiles();
		
		// 하위 정보를 바로 사용이 안되니, 한번더 File 타입의 기능을 이용해서, 필요한 정보들 출력해보기. 
		for(int i =0 ; i<subFiles.length; i++) {
			File file = subFiles[i]; // 각각 File 타입
			// 마지막 수정 시간 
			long t = file.lastModified();
			// 파일명, 파일크기, 파일의 마지막 수정시간 출력하기. 
			System.out.println("파일 명 file.getName() : " + file.getName());
			System.out.println("파일 크기 file.length() : " + file.length());
			// format 출력 형태로 하기. 
			System.out.printf("파일의 수정시간 : %tb %td %ta %tT \n",t,t,t,t );
		}
		
	}
	
	public static void main(String[] args) {
		// File 클래스의 기본 메서드 확인용. 
		// 파일 생성, 폴더 생성, 파일의 메타 정보등을 확인 가능. 
		// 직접적인 입출력 불가. 
		
		File f1 = new File("c:\\windows\\system.in");
		// 출력 테스트 
		listDirectory(f1);
		
		

	}

}
