package practice.fundamentals.chapter5.sec1_multiarray;
/*
 * int型の2次元配列の作成と初期化をまとめて行い、
 * 配列中の任意の値を表示させるプログラムを作成してください。
 */
public class No002 {
	public static void main(String[] args) {
		int[][] array= {
			{123,456,789},
			{1234,2345,5678}
		};
		System.out.println(array[1][2]);
	}
}
