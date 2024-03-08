package ex_240308;

public class Ex_03_StringBuffer_1 {

	public static void main(String[] args) {
		String str3 = new String("HELLO");
		String str4 = new String("HELLO");
		String str3Concat = str3.concat(" world");
		String str4Concat = str4.concat(" world");
		System.out.println("str3.concat(\" world\") : " + str3.concat(" world"));
		System.out.println("str4.concat(\" world\") : " + str4.concat(" world"));
		System.out.println("=======str3,str4======기존 문자열의 메모리 위치값==");
		System.out.println("str3 System.identityHashCode : " + System.identityHashCode(str3));
		System.out.println("str4 System.identityHashCode : " + System.identityHashCode(str4));
		System.out.println("=======str3,str4======합친 문자열의 메모리 위치값==");
		System.out.println("str3Concat System.identityHashCode : " + System.identityHashCode(str3Concat));
		System.out.println("str4Concat System.identityHashCode : " + System.identityHashCode(str4Concat));

	}

}
