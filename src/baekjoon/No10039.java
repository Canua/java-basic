package baekjoon;

import java.util.Scanner;

public class No10039 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] str = new int[5];
		for (int i = 0; i < str.length; i++) {
			str[i] = s.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] < 40) {
				str[i] = 40;
			}
			sum += str[i];

		}
		System.out.println(sum / 5);

	}
}
