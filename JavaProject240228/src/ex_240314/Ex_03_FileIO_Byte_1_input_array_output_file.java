package ex_240314;

import java.io.FileOutputStream;

public class Ex_03_FileIO_Byte_1_input_array_output_file {
	public static void main(String[] args) {
		// 읽을 대상 : 배열 
		byte [] b = {7,5,3,4, -1,24};
		
		try {
			// 출력 대상 지정 
			FileOutputStream fout = new FileOutputStream("c:\\temp_240314\\test.out");
			// 반복문으로 , 배열에서 읽어서, 출력대상에 쓰기 작업. 
			for (int i = 0 ; i < b.length ; i++) {
				fout.write(b[i]);
			}
			// 자원 반납 
			fout.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
