package practice.fundamentals.chapter5.sec2_arraylist;
/*
 * ArrayListクラスをインスタンス化し、任意のデータ型で任意の値を格納してください。
 * また、ArrayListクラス内に用意されているメソッドを適当に使用したプログラムを作成してください。
 * ※ArrayListクラスのメソッドは以下URLから検索して使用すること
 * https://docs.oracle.com/javase/jp/8/docs/api/index.html
 */
import java.util.ArrayList;
public class No004 {
	public static void main(String[] args) {
	ArrayList<String> おじさん=new ArrayList(4);
	おじさん.add("おじさん");
	おじさん.add("カフェインおじさん");
	おじさん.add("薬中おじさん");
	おじさん.add("単なるおじさん");

	おじさん.remove(3);


	for(int o=0;o<おじさん.size();o++) {
		System.out.println(おじさん.get(o));
	}
	System.out.println(おじさん.contains("単なるおじさん"));
	}
}
