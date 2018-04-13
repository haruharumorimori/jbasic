package practice.fundamentals.chapter4.sec1_method;
/*
 * double型を引数に取る割り算メソッド作成してください。
 * mainメソッドからそのメソッドを使っていくつかの割り算を実行させて結果を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		double a1=3.2;
		double a2=4.2;
		div(a1,a2);

		double a3=0.3;
		double a4=0.44;
		div(a3,a4);
	}

public static void div(double a,double b) {
	System.out.println(a/b);
}
}
