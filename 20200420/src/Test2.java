
public class Test2 {
	public static void main(String[] args) {
		/* int i, j; */
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				if ((i * 10 + j) + (j * 10 + i) == 99) {
					System.out.println("   " + i + j);
					System.out.println(" + " + j + i);
					System.out.println("---------");
					System.out.println("   " + ((i * 10 + j) + (j * 10 + i)));
					System.out.println();
				}
			}
		}
	}
}
