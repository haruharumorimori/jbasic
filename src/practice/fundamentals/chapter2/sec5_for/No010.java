package practice.fundamentals.chapter2.sec5_for;
/*
 * String型の配列にを宣言し、拡張for文を使用して順番に表示させるプログラムを作成してください。
 * ※String型の配列に代入する値と数は任意とする
 */
public class No010 {
	public static void main(String[] args) {
		String[] s= {"りんご","ごりら","らっぱ","パンツ","つみき"};
				for(String ss:s) {
					System.out.println(ss);
		}
	}
}
