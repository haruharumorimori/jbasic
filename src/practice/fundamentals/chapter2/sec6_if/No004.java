package practice.fundamentals.chapter2.sec6_if;

/*
 * int型変数x、yに対し、x÷yの演算が割り切れるかどうかを判定するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		int x=33;
		int y=11;
		if(x%y==0) {
			System.out.println("xはyで割り切れます。");
		}else {
	System.out.println("Error");
	}
	}
}
