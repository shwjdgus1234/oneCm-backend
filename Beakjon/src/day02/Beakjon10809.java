package day02;

import java.util.Scanner;

public class Beakjon10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		int[] line = new int[26];

		for (int i = 0; i < 26; i++) {
			line[i] = -1;
		}

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (line[ch - 'a'] == -1) {
				line[ch - 'a'] = i;
			}
		}

		for (int i = 0; i < 26; i++) {
			System.out.print(line[i] + " ");
		}

	}
}
