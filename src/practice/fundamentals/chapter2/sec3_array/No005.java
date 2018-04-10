package practice.fundamentals.chapter2.sec3_array;

/*
 * 要素型がintの配列を生成して、一番最後の要素を表示するプログラムを作成してください。
 * 要素数は3以上であること。
 */
public class No005 {
	public static void main(String[] args) {
		int[] i=new int[3];
		i[0]=1;
		i[1]=2;
		i[2]=3;
		System.out.println(i[2]);
	}
}
