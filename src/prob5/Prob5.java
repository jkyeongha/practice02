package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Random r = new Random();
			int k = r.nextInt(100) + 1;
			
			System.out.println("수를 결정하였습니다. 맞추어보세요");

			int min=0, max=100;
			
			int a = scanner.nextInt();
	
			while(true) {
				
				if(a==k) {
					System.out.println("찾았습니다.");
					break;
				}else if(a<k) {
					System.out.println("더 높게");
					min=a;
				}else {
					max=a;
					System.out.println("더 낮게");
				}
				
				System.out.println(min+"-"+max);
				a=scanner.nextInt();
			
			}
			System.out.print("다시 하시겠습니까(y/n)>>");
			String answer=scanner.next();
			if(answer.equals("y")) {
				continue;
			}else {
				break;
			}
		}
		scanner.close();
	}

}