package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.println( "5개의 숫자를 입력하세요." );
		int intArray[] = new int[5];
		double sum=0;
		
		for(int i=0; i<5; i++) {
			intArray[i]=scanner.nextInt();
			sum += intArray[i];
		}
		
		System.out.println("평균은 "+(sum/5)+" 입니다.");
		
		
		scanner.close();
		
	
	}
}
