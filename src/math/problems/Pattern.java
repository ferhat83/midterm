package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		int array[] = new int[101];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		System.out.println("Pattern of 5: ");
		for (int j = 0; j <= 20; j++) {
			if (j % 5 == 0) {
				System.out.print(j + ",");
			}
		}
		System.out.println("\n");

		System.out.println("Pattern of 4:");
		for (int i = 21; i <= 40; i++) {
			if (i % 4 == 0) {
				System.out.print(i + ",");
			}

		}
		System.out.println("\n");

		System.out.println("Pattern of 3:");
		for (int i = 41; i < 70; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println("\n");

		System.out.println("Pattern of 2:");
		for (int i = 70; i < 90; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println("\n");

		System.out.println("Pattern of 1:");
		for (int i = 90; i <= 100; i++) {
			if (i % 1 == 0) {
				System.out.print(i + ",");
			}
		}

	}

}



