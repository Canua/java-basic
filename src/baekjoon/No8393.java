package baekjoon;

import java.util.Scanner;

public class No8393 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int sum = 0;
		while (0 < a) {
			sum += a;
			a--;

		} 
		System.out.println(sum);
	}
}
