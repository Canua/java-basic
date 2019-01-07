package baekjoon;

import java.util.Scanner;

public class No2577 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i1 = s.nextInt();
		int i2 = s.nextInt();
		int i3 = s.nextInt();
		String z = "1";
		int result = i1 * i2 * i3;
		int[] count = new int[10];
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		String check = Integer.toString(result);
		String[] count_str = new String[check.length()];
		for (int i = 0; i < check.length(); i++) {
			count_str[i] = check.substring(i, i + 1);

		}
		int set_count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < count_str.length; j++) {
				if (i == Integer.parseInt(count_str[j])) {
					count[i]++;
				}
			}
			System.out.println(count[i]);
		}

	}
}
