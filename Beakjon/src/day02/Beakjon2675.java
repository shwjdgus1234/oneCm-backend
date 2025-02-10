package day02;

import java.util.Scanner;

public class Beakjon2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String input = sc.nextLine();
			String[] inputArr = input.split(" ");
			int R = Integer.parseInt(inputArr[0]);
			String S = inputArr[1];

			StringBuilder result = new StringBuilder();

			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					result.append(S.charAt(j));
				}
			}

			System.out.println(result.toString());
		}

		sc.close();
	}
}
