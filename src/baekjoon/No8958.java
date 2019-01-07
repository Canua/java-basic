package baekjoon;

import java.util.Scanner;

public class No8958 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int[] points = new int[80];
		points[0] = 0;
		int result = 1;
		for (int i = 1; i < points.length; i++) {
			if (i == 0) {
				points[i] = result;
			} else {
				points[i] = points[i - 1] + result;
			}
			result++;
		}
		int[] get_point = new int[count];
		String[] str = new String[count];
		for (int i = 0; i < str.length; i++) {
			str[i] = s.next();
		}
		for (int i = 0; i < count; i++) {
			String[] check = str[i].split("X");
			for (int j = 0; j < check.length; j++) {
//				System.out.println(check[j]);
//				System.out.println(points[check[j].length()]);
//				System.out.println(check[j].length());
				get_point[i] += points[check[j].length()];
			}
		}
		for (int i = 0; i < get_point.length; i++) {
			System.out.println(get_point[i]);
		}
	}
}

//1 3 6 10 15 21 28 36 45 55