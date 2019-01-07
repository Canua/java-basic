package baekjoon;

import java.util.Scanner;

public class No11720 {
	public static void main(String[] args) {
		String[] str;
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String line = s.next();
		str = line.split("");
		int sum = 0;
		for (int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);
		} 
		System.out.println(sum);
	}
}
