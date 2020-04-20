import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println("스위치 공부해야됨");
		Scanner scan = new Scanner(System.in);
		// ctrl + shift + f 자동정렬
		int input = scan.nextInt();
		switch (input) {
		case 1:
			System.out.println("1을 입력했네요");
			break;

		case 2:
			System.out.println("2를 입력했네요");
			break;

		case 3:
			System.out.println("3을 입력했네요");
			break;
		default:
			System.out.println("다른거 입력했네요");
			break;
		}
	}
}
