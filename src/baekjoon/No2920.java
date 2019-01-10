package baekjoon;

import java.util.Scanner;

public class No2920 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// ascending descending mixed
		String[] str = new String[8];
		int[] check = new int[8];
		String s1 = "12345678";
		String s2 = "87654321";
		int j = 0;
		for (int i = 0; i < str.length; i++) {
			str[i] = s.next();
			j = i + 1;
			check[i] = j;
		}
		String test = "";
		String input = "";
		for (int i = 0; i < 8; i++) {
			test += str[i];
		}
		switch (test) {
		case "12345678":
			System.out.println("ascending");
			break;
		case "87654321":
			System.out.println("descending");
			break;
		default:
			System.out.println("mixed");
			break;
		}
	}
}
