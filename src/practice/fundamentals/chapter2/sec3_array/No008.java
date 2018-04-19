package practice.fundamentals.chapter2.sec3_array;
/*
 * 7,12,37,24,2,92,51を要素に持つ配列を生成し、
 * for文を使用してすべての要素を表示させるプログラムを作成してください。
 */
public class No008 {
	public static void main(String[] args) {
		int[] i= {7,12,37,24,2,92,51};
		for(int a=0;a<i.length;a++) {
			System.out.println(i[a]);
		}
	}
}
