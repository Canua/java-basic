package baekjoon;

public class Test {
	public static void main(String[] args) {
		String s = "OOOXOOXXOO";
		String[] tokens = s.split("X");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
}
