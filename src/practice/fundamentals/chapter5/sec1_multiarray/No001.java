package practice.fundamentals.chapter5.sec1_multiarray;
/*
 * int型の2次元配列を作成し、それぞれ任意の値を代入してください。
 * また、配列中の任意の値を表示させるプログラムを作成してください。
 * ※2次元配列の要素数は任意とする。
 */
public class No001 {
	public static void main(String[] args) {
		int[][] num= new int[2][3] ;
		num[0][0]=123;
		num[0][1]=234;
		num[0][2]=345;
		num[1][0]=456;
		num[1][1]=567;
		num[1][2]=678;
		System.out.println(num[0][1]);
	}
}
