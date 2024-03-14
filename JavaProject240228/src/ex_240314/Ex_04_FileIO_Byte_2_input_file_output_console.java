package ex_240314;

import java.io.FileInputStream;

public class Ex_04_FileIO_Byte_2_input_file_output_console {

	public static void main(String[] args) {
		// 임시로 담아둘 배열을 지정.
		byte[] bTemp = new byte[10];

		try {
			// 파일 읽기 대상 지정
			FileInputStream fis = new FileInputStream("c:\\temp_240314\\test.out");
			
			// 출력 대상 : 콘솔
			// c, 읽어서 정수로 반환한 값을 담아둘 임시 변수
			// n, 상태를 표시하기위한 값, 
			int n = 0;
			int c = 0;
			// 파일 -> 메모리 (임시배열)
			while((c= fis.read()) != -1) {
				// fis.read() , 읽은 값을 정수로 변환
				// 정수를 바이트로 형변환해서, 바이트 단위의 배열에 담기. 
				bTemp[n]= (byte)c;
				// n, 인덱스로 이용중. 담을 배열의 순서.
				n++;
			}
			// 출력하기. 
			System.out.println("임시 배열 bTemp 출력하기.");
			for(int i =0; i<bTemp.length; i++) {
				System.out.println("bTemp의 값 출력하기 : " + bTemp[i]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
