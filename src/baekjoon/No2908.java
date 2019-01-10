package baekjoon;

import java.util.Scanner;

public class No2908 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		String s3 = "";
		String s4 = "";
		for (int i = s1.length(); i > 0; i--) {
			s3 += s1.substring(i - 1, i);
		}
		for (int i = s2.length(); i > 0; i--) {
			s4 += s2.substring(i - 1, i);
		}
		int i1 = Integer.parseInt(s3);
		int i2 = Integer.parseInt(s4);
		int result = (i1 > i2) ? i1 : i2;
		System.out.println(result);
	}
}
