package baekjoon;

import java.util.Scanner;

public class No2739 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 1; i < 10; i++) {
			int result = a * i;
			System.out.println(a + " * " + i + " = " + result);
		}
	}
}
