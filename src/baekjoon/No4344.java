package baekjoon;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No4344 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#####.000");

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		double[] nums_list = new double[a];
		for (int i = 0; i < nums_list.length; i++) {
			double total = 0;
			int num = s.nextInt();
			double result = 0;
			double[] nums = new double[num];
			for (int j = 0; j < nums.length; j++) {
				nums[j] = s.nextInt();
				total += nums[j];
			}
			double avg = total / nums.length;
			int count = 0;
			for (int k = 0; k < nums.length; k++) {
				if (nums[k] > avg) {
					count++;
				}
			}
			result = 100.0 * count / nums.length;
			nums_list[i] = Math.round(result * 1000) / 1000.0;
		}
 
		for (int i = 0; i < nums_list.length; i++) {
			String s1 = df.format(nums_list[i]);
			System.out.println(s1 + "%");
		}

	}
}
/*
 * import java.io.BufferedReader; import java.io.IOException; import
 * java.io.InputStreamReader; import java.util.StringTokenizer;
 * 
 * public class No4344 {
 * 
 * static StringTokenizer st;
 * 
 * public static void main(String[] args) throws IOException { BufferedReader br
 * = new BufferedReader(new InputStreamReader(System.in)); st = new
 * StringTokenizer(br.readLine());
 * 
 * int c = Integer.parseInt(st.nextToken()); // 테스트 케이스의 개수
 * 
 * for (int i = 0; i < c; i++) { st = new StringTokenizer(br.readLine()); int n
 * = Integer.parseInt(st.nextToken()); // 각 테스트케이스마다 학생의 수
 * 
 * int sumScore = 0; int[] studentArray = new int[1000]; int averageScore = 0;
 * double superiorStudent = 0; for (int j = 0; j < n; j++) { int score =
 * Integer.parseInt(st.nextToken()); // 각각의 점수 sumScore += score;
 * 
 * studentArray[j] = score; // N명의 점수 배열 } averageScore = sumScore / n; // 각
 * 테스트케이스의 평균
 * 
 * for (int k = 0; k < studentArray.length; k++) {
 * 
 * if (studentArray[k] > averageScore) { // 평균이 넘는지 비교 superiorStudent++; } }
 * 
 * double output = (superiorStudent / n) * 100.00; System.out.printf("%.3f",
 * output); System.out.println("%"); }
 * 
 * }
 * 
 * }
 */