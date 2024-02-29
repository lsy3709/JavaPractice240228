package ex_240229;

import java.util.Scanner;

public class Ex_12_NestedArray_test9 {
	public static void main(String[] args) {
		// 국어, 영어, 수학 3과목의 점수를 입력받아서, 평균, 총점. 
		// 1) 기본 배열을 만들어서,  1번 학생 : {70,80,90}, 이런형식으로 이중 배열로, 5명의 점수를 더미로
		// 출력 형식 : 1번 학생의 총점 : ? , 평균 : ? 
		int score [][] = {
				{70,80,90}, //score [0][]
				{60,70,80},//score [1][]
				{90,100,60},//score [2][]
				{100,30,60},//score [3][]
				{50,50,90},//score [4][]
		};
		
		for(int i = 0 ; i<score.length; i++) {
			int sum = 0; 
			for(int j = 0 ; j<score[i].length; j++) {
				sum += score[i][j];
			}
			System.out.println((i+1)+"번 학생의 총점 : " + sum + ", 평균 : " + sum/3);
		}
		
		
		// 2) 스캐너에서 학생수 몇명 입력받고, 스캐너에서 해당 임의의 점수를 직접 입력해서, 집계
		// 3) 학생수도 임의로 1 이상 10미만으로 자동 설정., 점수도 자동으로 60이상 100미만 입력되고 , 집계 
		// 함수로 만들기. 
		
	}
}
