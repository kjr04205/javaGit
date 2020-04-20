
public class Test1 {
	public static void main(String[] args) {
		System.out.println("구구단의 짝수 단을 출력해보자");
		int dan = 2;
		int num;
		if (dan % 2 == 0) {
			for (dan = 2; dan < 9; dan+=2) {
				for (num = 1; num < dan + 1; num++) {
					System.out.println(dan+" * "+num+" = " + (dan * num)+" ");
				}
				System.out.println();
			}
		}
	}
}
