package ex_240314;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex_06_FileIO_File_byteArray_output {

	public static void main(String[] args) {
		// 이미지 복사, 바이트로 읽어서, 쓸 때, 한바이트가 아니라, 특정 배열 크기 만큼씩 쓰기. 
		// 원본 이미지 경로, 출력 대상 경로, File 클래스 이용하기. 
		File src = new File("c:\\temp_240314\\브레드1.jpg");
		// 복사한 이미지 파일(여기에, 출력할 예정. )
		File dst = new File("c:\\temp_240314\\복사된_브레드1.jpg");
		
		try {
			// 이미지를 읽으려면 바이트로 읽어야 한다. 바이트를 읽기 위한 도구. 
			FileInputStream fis = new FileInputStream(src);
			// 바이트를 출력하기 위한 도구.
			FileOutputStream fos = new FileOutputStream(dst);
			// 특정 배열 크기를 지정. 10 kbyte
			byte[] buffer = new byte[1024*10];
			while(true) {
				// 버퍼의 크기만큼 읽기, n은 실제 읽은 바이트 
				int n = fis.read(buffer);
				// 출력하기, 버퍼에 담아서, 처음 부터, 해당 크기 만큼 쓰기. 
				fos.write(buffer,0,n);
				// 읽은 크기가 해당 버퍼 크기보다 작다면, 없다는 이야기. 
				if(n < buffer.length)
					break;
			}
			fis.close();
			fos.close();
			System.out.println(src.getPath() + "를" + dst.getPath() + "로 복사함");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
