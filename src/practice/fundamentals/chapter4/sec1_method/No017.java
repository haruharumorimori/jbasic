package practice.fundamentals.chapter4.sec1_method;
/*
 * 2つの整数の足し算を行うメソッドと引き算を行うメソッドを作成してください。
 * 足し算を行った結果と任意の数値を引き算メソッドに使用して、結果を表示させるプログラムを作成してください。
 */
public class No017 {
	public static void main(String[] args) {
		int s=add(8,9);
		pull(s,10);
		System.out.println(s);
		System.out.println(pull(s,10));
	}

	static int add(int a,int b) {
		int c= a+b;
		return c;
	}
	static int pull(int x,int y) {
		return x-y;
	}

}
