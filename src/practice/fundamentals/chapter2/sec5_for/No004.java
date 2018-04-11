package practice.fundamentals.chapter2.sec5_for;
/*
 * 1から10までの整数を足した結果を表示させるプログラムをfor文を使って作成してください。
 */
public class No004 {
	public static void main(String[] args) {

		int a=1;
		int b=0;
		while (a<=10) {
			b+=a;
			a++;
		}
		System.out.println(b);
	}
}
