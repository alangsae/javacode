package exam.ifTest;

import java.util.Scanner;

public class Iftest1 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner (System.in)) {

			int count = 0;
			while (count<=4){

				int com = (int) (Math.random()*6+1);
				System.out.println(com);
				String player = scan.next();
			
						if (player>=1 && player<=6 ) {
//							if(com==player) {
//								System.out.println("정답");
//								count = ++count;
//							}
//						}else {
//							System.out.println("다음기회에");
//						}else
//						{
//							System.out.println("숫자 범위를 벗어났습니다.");
//						}
						System.out.println(count + "번 맞췄습니다");
			}
		}


	}


