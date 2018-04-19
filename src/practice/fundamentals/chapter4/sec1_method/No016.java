package practice.fundamentals.chapter4.sec1_method;
/*
 * 戻り値ありのメソッドを任意に作成し、メソッドを使用した結果を変数に入れずに出力するプログラムを作成してください。
 */
public class No016 {
public static void main(String[] args) {
	No016 n=new No016();
	int a=987654321;
	System.out.println(n.up(a));
	}
int a;
public int up(int a) {
	return a;
	}
}
