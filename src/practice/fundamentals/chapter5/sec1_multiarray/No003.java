package practice.fundamentals.chapter5.sec1_multiarray;
/*
 * int型の3次元配列を作成し、それぞれ任意の値を代入してください。
 * また、配列中の任意の値を表示させるプログラムを作成してください。
 * ※3次元配列の各要素数は3とする。
 */
public class No003 {
	public static void main(String[] args) {
		int[][][] a=new int[3][3][3];
		a[0][0][0]=123;
		a[0][1][0]=2345;
		a[1][0][1]=234567;
		a[1][1][1]=234;
		a[1][2][2]=777;
		a[0][0][1]=666;
		System.out.println(a[1][2][2]);
	}
}
