package exam.If;

import java.util.Scanner;

public class ExampleMyself {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int count=0;
		for(int i=0;i<3; i++) {

			int num = (int)(Math.random()*6+1);
			System.out.println(num);
			int player = scan.nextInt();


			Scanner scan1 = new Scanner(System.in);
			System.out.println("판별할 문자열을 입력하세요 :");
			String input = scan1.nextLine();
			System.out.println(input);
			
			char tmp;
			boolean output = true;


			for(int i1 = 0 ; i1<input.length(); i1++) {
				tmp=input.charAt(i1);

				if(!('0' <=tmp && tmp <='9' )) {
					output = false;
				}

			}
			System.out.println("숫자여부 : " + output);
			int player1 = Integer.parseInt(input);

			if player1(player1>=1 && player1 <=6) {
				int com;
				if(com==player1)
			}
		}
	}
}