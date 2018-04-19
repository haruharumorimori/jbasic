package practice.fundamentals.chapter2.sec2_variable;
/*
 * キーボードから読み込んだ整数値の最下位桁を除いた値と、
 * 最下位桁を表示するプログラムを作成してください。
 */
public class No019 {
	public static void main(String[] args) {
		div(59);
		vpp(59);
		System.out.println("最小桁を除いた値は"+div(59)*10);
		System.out.println("最小桁は"+vpp(59));
	}

	int a;
	static int div(int a) {
		int b=a/10;
		return b;
	}
	static int vpp(int a) {
		int c=a%10;
		return c;
	}
}
