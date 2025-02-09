package day01;

import java.util.Scanner;

public class Beakjon1546 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		int[] scores = new int[test];
		int max = 0;

		for (int i = 0; i < test; i++) {
			scores[i] = sc.nextInt();
			if (scores[i] > max) {
				max = scores[i];
			}
		}

		sc.close();

		double sum = 0;
		for (int i = 0; i < test; i++) {
			sum += (double) scores[i] / max * 100;
		}

		System.out.println(sum / test);
	}

}
