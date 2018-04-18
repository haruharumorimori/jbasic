package practice.fundamentals.chapter2.sec3_array;

/*
 * 次の配列を定義して、配列の要素数を取得して表示するプログラムを作成してください。
 * int[] i = {1,2,3,4,5}
 */
public class No002 {
	public static void main(String[] args) {
		int[] intarray = new int[5];
		intarray[0]=1;
		intarray[1]=2;
		intarray[2]=3;
		intarray[3]=4;
		intarray[4]=5;
		int len = intarray.length;

		System.out.println("intarrayの要素の数は"+len);
	}
}

