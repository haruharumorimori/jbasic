package practice.fundamentals.chapter4.sec1_method;
/*
 * キーボード入力により受け取った整数を引数に取り、
 * その中央値を求めるメソッド「med」を作成してmainメソッド内で使用するプログラムを作成してください。
 */
public class No009 {
	public static void main(String[] args) {
		int a1=180;
		int b1=9916473;
		int c1=873617528;
		No009 n=new No009();
		n.med(a1, b1, c1);
	}

	int a;
	int b;
	int c;
	public void med(int a,int b,int c){
		if(b<=a&&a<=c||c<=a&&a<=b) {
			System.out.println(a+"が中央値");
		}else if(a<=b&&b<=c||c<=b&&b<=a) {
			System.out.println(b+"が中央値");
		}else if(a<=c&&c<=b||b<=c&&c<=a) {
			System.out.println(c+"中央値");
		}
	}
}
