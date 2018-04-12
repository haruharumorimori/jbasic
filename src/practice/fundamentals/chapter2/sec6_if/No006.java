package practice.fundamentals.chapter2.sec6_if;

/*
 * double型変数xに対し、xに代入された数字が整数か少数か判定するプログラムを作成してください。
 */
public class No006 {
	public static void main(String[] args) {
		for(double x=1.1;x<=2.0;x++) {
			if(x<2) {
				System.out.println("これは少数です");
			}else {
				System.out.println("これは少数ではないです");
			}
		}

	}
}
