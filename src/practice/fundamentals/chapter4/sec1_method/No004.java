package practice.fundamentals.chapter4.sec1_method;
/*
 * テストの点数を受け取り、合格か不合格の文字列を返すメソッドを定義してください。
 * mainメソッドからキーボード入力で点数を受け取り、メソッドを使って判定してください。
 * ※80点以上で合格とする。
 */
public class No004 {
	public static void main(String[] args) {
		int Testpoint=89;

		check(Testpoint);
	}

public static void check(int a) {
		if(a<=79) {
			System.out.println("不合格");
		}else {
			System.out.println("合格");
		}
	}
}
