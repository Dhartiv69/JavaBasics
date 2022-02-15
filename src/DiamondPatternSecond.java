
public class DiamondPatternSecond {

	public static void main(String[] args) {
		System.out.println("Diamond Of Numbers");

		for(int a = 1; a<=4; a++) {
		   for (int b = a; b <= 4; b++) {

				System.out.print(" ");
			}

			for (int c = 1; c <= a; c++) {

				System.out.print(a+" ");

			}
		   System.out.println();
		}

		for(int a = 2; a<=4; a++) {
		   for (int b = 1; b <= a; b++) {

				System.out.print(" ");
			}
			for (int c = a; c <= 4; c++) {

				System.out.print(a+ " ");
			}

			System.out.println();

		}

		System.out.println();

        }

}


