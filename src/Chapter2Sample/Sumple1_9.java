package Chapter2Sample;

public class Sumple1_9 {
	public static void main(String[] args) {
		for (int x = 1; x <=10; x++) {
			System.out.print(x);
		}

		System.out.println();

		int y = 1;//初期化はループ外でも可
		for(;y<=10;y++) {
			System.out.print(y);
		}
	}
}
