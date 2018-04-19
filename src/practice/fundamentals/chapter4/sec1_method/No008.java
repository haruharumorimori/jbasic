package practice.fundamentals.chapter4.sec1_method;
/*
 * 3つのint型引数a,b,cの最小値を求めるメソッド「min」を作成して、
 * mainメソッド内で結果を表示させるプログラムを作成してください。
 */
public class No008 {
	public static void main(String[] args) {
		int a1=10;
		int b1=29;
		int c1=398;

		min(a1,b1,c1);
	}

	int a;
	int b;
	int c;
	static void min(int a,int b,int c) {
		if(a<b&&a<c) {
			System.out.println(a+"が最小値です。");
		}else if(b<a&&b<c) {
			System.out.println(b+"が最小値です。");
		}else if(c<a&&c<b) {
			System.out.println(c+"が最小値です。");
		}
	}
}
