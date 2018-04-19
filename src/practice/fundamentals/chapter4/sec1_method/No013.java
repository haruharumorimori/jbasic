package practice.fundamentals.chapter4.sec1_method;
/*
 * ２つの整数の平均を計算するメソッドを作成しなさい。２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
 * また、メソッドの動作を検証できるようにプログラムを作成してください。
 * ※平均の計算は整数で行うこと
 */
public class No013 {
	public static void main(String[] args) {
		int a=908;
		int b=9876;
		System.out.println(average(a,b));
	}
	int a;
	int b;
	public static int average(int a,int b) {
		int c=(a+b)/2;
		return c;
	}
}
