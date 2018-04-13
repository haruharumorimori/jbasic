package practice.fundamentals.chapter4.sec1_method;
/*
 * 2つのint型を引数に取る足し算メソッドを作成してください。
 * mainメソッドからそのメソッドを使っていくつかの足し算を実行させて結果を表示させるプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		add(a, b);

		int c=4987;
		int d=56789;
		add(c,d);
	}


		private static void add(int a1, int a2) {
			System.out.println(a1+a2);
		}
	}