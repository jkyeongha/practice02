package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		
		System.out.print( "금액:" );
		int money = scanner.nextInt();
		
		int[] array = new int[10];
		int[] array2  = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		if(money>0) {
						
			for(int i=0; i<10; i++) {
				if(money/array2[i]!=0) {
					int count = money/array2[i];
					array[i]=count;
					money=money-(count*array2[i]);
					System.out.println(array2[i]+"원 : "+array[i]+"개");
				}
			}
			
		}

		
		scanner.close();
 	}
}