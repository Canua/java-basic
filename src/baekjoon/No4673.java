package baekjoon;

public class No4673 {
	public static void main(String[] args) {
		boolean[] nums_check = new boolean[10001];
		int[] nums = new int[10001];
		int set = 1;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = set;
			nums_check[i] = false;
			// 초기화
			set++; 
		} 
		int count = 0;
		while (count <= 10000) {
			int result = 0;
			result += nums[count];
			while (result <= 10000) {
				String s2 = Integer.toString(result);
				for (int j = 0; j < s2.length(); j++) {
					String s3 = s2.substring(j, j + 1);
					int sub = Integer.parseInt(s3);
					result += sub;
				}
				if (result > 10000) {
					break;
				} else {
					nums_check[result] = true;
				}
			}
			count++;
		}

		for (int i = 0; i < nums_check.length; i++) {
			if (nums_check[i] == false)
				System.out.println(i);
		}
	}
}

/*
 * boolean[] isNotSelfNumber = new boolean[10001];
 * 
 * for (int i = 1; i <= 10000; ++i) { int dn = getDn(i); if (dn <= 10000) {
 * isNotSelfNumber[dn] = true; } }
 * 
 * for (int i = 1; i < isNotSelfNumber.length; ++i) { if (!isNotSelfNumber[i]) {
 * System.out.println(i); } } }
 * 
 * private static int getDn(int n) { int dn = n; while (n > 0) { dn += n % 10; n
 * /= 10; } return dn; }
 * 
 */