package practice.fundamentals.chapter2.sec5_for;
/*
 * 2 の 1 乗から 8 乗までを計算し表示するプログラムを作成してください。
 */
public class No006 {
	public static void main(String[] args) {
		int a=1;
		for(int b=1;b<=8;b++) {
			System.out.println(a*=2);}
	}
}
