package exam.ifTest;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 87
		switch(total/10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 9:
			System.out.println("C");
		}
	}

}
