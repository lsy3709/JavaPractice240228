package ex_240229;

import java.util.Scanner;

public class Ex_12_NestedArray_test9 {
	public static void main(String[] args) {
		// 국어, 영어, 수학 3과목의 점수를 입력받아서, 평균, 총점.
		// 1) 기본 배열을 만들어서, 1번 학생 : {70,80,90}, 이런형식으로 이중 배열로, 5명의 점수를 더미로
		// 출력 형식 : 1번 학생의 총점 : ? , 평균 : ?
		int score[][] = { { 70, 80, 90 }, // score [0][]
				{ 60, 70, 80 }, // score [1][]
				{ 90, 100, 60 }, // score [2][]
				{ 100, 30, 60 }, // score [3][]
				{ 50, 50, 90 },// score [4][]
		};
		showSumAndAvg(score);

		// 2) 스캐너에서 학생수 몇명 입력받고, 스캐너에서 해당 임의의 점수를 직접 입력받기, 집계
		// 잠시 생각을 해보니, 10명이면, 30번 입력 해야하는 각인데 ?? 현타 오네.
		// 점수를 자동으로 할당을 할까?

		Scanner scanner = new Scanner(System.in);
		// 이중 배열의 행의로 사용할 예정
		// int score [행][3]
		System.out.println("학생수를 입력해주세요.>>");
		int studentNumber = scanner.nextInt();

		// 3) 학생수도 임의로 1 이상 10미만으로 자동 설정., 점수도 자동으로 60이상 100미만 입력되고 , 집계
		// 함수로 만들기.
		int[][] studentsScore = makeSubjectRandomScore(studentNumber);
		showSumAndAvg(studentsScore);
	}

	// 배열을 입력을 받아서, 집계를 해주는 함수
	public static void showSumAndAvg(int score[][]) {

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "점, ");
			}
			
			System.out.println((i + 1) + "번 학생의 총점 : " + sum + ", 평균 : " + sum / 3);
		}
	}
	// 자동으로 학생수 에 맞게 , 자동 국어, 영어, 수학 점수를 입력 해주는 함수 
	// 리턴을 이중배열을 생성해주면됨. 
	public static int[][] makeSubjectRandomScore(int studentNumber) {
		//임시 배열 만들기. 
		int [][] sampleScore = new int[studentNumber][3];
		// 임시 배열에 점수 넣기는 
		for (int i = 0; i < sampleScore.length; i++) {
			for (int j = 0; j < sampleScore[i].length; j++) {
				boolean isCheckedScore = false;
				int score = 0;
				// 1이상 101미만 
				while (true) {
					
					score = (int)(Math.random()*100 +1);
					if(score >= 60) {
						break;
					}
				}
				// 값 넣기 
				if (score >=60 ) {
					sampleScore[i][j] =	score;
				}
				 
			}
		}
		return sampleScore;
	}
}
