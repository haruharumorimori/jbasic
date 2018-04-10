package practice.fundamentals.chapter2.sec3_array;

/*
 * 3人のテスト結果がそれぞれ84点、74点、92点でした。
 * 点数を配列に入れるため、配列の宣言と領域の確保、及び初期化を行って下記の様に出力するプログラムを作成してください。
 * ▼出力結果
 * 1人目：84
 * 2人目：74
 * 3人目：92
 */
public class No001 {
	public static void main(String[] args) {
		int[] 点数 = new int[3];
		点数[0]=84;
		点数[1]=74;
		点数[2]=92;

		System.out.println("1人目:"+点数[0]);
		System.out.println("2人目:"+点数[1]);
		System.out.println("3人目:"+点数[2]);
	}
}
