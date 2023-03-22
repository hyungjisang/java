package Exam1;

import java.util.Scanner;

public class ArrayExam11 {

	public static void main(String[] args) {
		int[] score = new int[5];
		int sum = 0;
		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for( int i = 0; i<5; i++) {
			System.out.print("성적입력: ");
			score[i] = sc.nextInt();
			sum = sum + score[i];
			sum += score[i];
			
		}
		System.out.println("합계: " + sum);
		avg = (double)sum / score.length;
		System.out.printf("평균 : %.lf",avg);
		
		// TODO Auto-generated method stub

	}

}
