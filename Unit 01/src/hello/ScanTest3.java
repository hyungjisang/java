package hello;

import java.util.Scanner;

public class ScanTest3 {

	public static void main(String[] args) {
		int num1, num2, num3;
		int sum;
		double avg;
		Scanner scp = new Scanner(System.in);
		System.out.print("ù��° �� �Է�: ");
		num1 = scp.nextInt();
		System.out.print("�ι�° �� �Է�: ");
		num2 = scp.nextInt();
		System.out.print("����° �� �Է�: ");
		num3 = scp.nextInt();
		sum= num1 + num2+ num3;
		avg = sum / 3.0;
		System.out.printf("�հ� : %d ��� : %.1f ", sum,avg);
		
		

	}

}
