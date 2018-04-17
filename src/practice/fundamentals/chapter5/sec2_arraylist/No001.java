package practice.fundamentals.chapter5.sec2_arraylist;

/*
 * ArrayListクラスをインスタンス化し、addメソッドを使用して以下のデータを格納してください。
 * また、格納後に拡張for文を使用して格納したデータを画面に出力するプログラムを作成してください。
 * ・ばなな
 * ・りんご
 * ・ぶどう
 *
 * ※ジェネリックは適当に定義すること
 */
import java.util.ArrayList;
public class No001 {
	public static void main(String[] args) {
		ArrayList<String> fluit= new ArrayList<String> (3);
		fluit.add("ばなな");
		fluit.add("りんご");
		fluit.add("ぶどう");
		for(int i=0;i<fluit.size();i++) {
			System.out.println(fluit.get(i));
		}
	}

}
