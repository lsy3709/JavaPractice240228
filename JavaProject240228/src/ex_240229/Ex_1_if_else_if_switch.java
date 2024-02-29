package ex_240229;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Ex_1_if_else_if_switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("HTML,CSS,JS,JAVA 과목 점수 입력하기(예: 100 70 80 90 )");
		int htmlScore = scanner.nextInt();
		int cssScore = scanner.nextInt();
		int jsScore = scanner.nextInt();
		int javaScore = scanner.nextInt();
		
		String result = toAvgTotalScore(htmlScore,cssScore,jsScore,javaScore);
		int resultAvgScore = toAvgScore(htmlScore, cssScore, jsScore, javaScore);
		
		System.out.println(result);
		
		if(resultAvgScore >= 90 ) {
			System.out.println(" A 등급입니다");
		} else if (resultAvgScore >= 80 && resultAvgScore < 90) {
			System.out.println(" B 등급입니다");
		}
		
	}

	// 성적을 입력해서, 총점, 평균을 구하는 간단한 함수
	// HTML, CSS, JS, JAVA , 4과목에 대한 점수를 입력 받아서, 반환하기.
	public static String toAvgTotalScore(int html, int css, int js, int java) {
		int resultTotalScore = html + css + js + java;
		int resultAvgScore = resultTotalScore / 4;
		String result = "결과 점수 , 총점 : " + resultTotalScore + "점, 평균 : " + resultAvgScore + " 점";
		return result;
	}
	
	public static int toAvgScore(int html, int css, int js, int java) {
		int resultTotalScore = html + css + js + java;
		int resultAvgScore = resultTotalScore / 4;
		return resultAvgScore;
	}

}
