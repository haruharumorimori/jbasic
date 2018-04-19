package practice.fundamentals.chapter2.sec6_if;

/*
 * int型変数xに対し、xに代入された数値が2桁の数値かどうかを判断するプログラムを作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		int x=12;

		if(x>=10) {
			System.out.println("xは二ケタの数です。");
		}else {
			System.out.println("Error");
		}
	}
}