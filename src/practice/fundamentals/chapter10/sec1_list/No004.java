package practice.fundamentals.chapter10.sec1_list;
/*
 * ArrayListを使用して値を代入後、拡張for文を使用して値を順番に表示するプログラムを作成してください。
 */
import java.util.ArrayList;
public class No004 {
	public static void main(String[] args) {
		ArrayList<String> おじさん= new ArrayList<String>();
		おじさん.add("ハイパーおじさん");
		おじさん.add("ギガンティックおじさん");
		おじさん.add("ファイナリティおじさん");
		おじさん.add("スタティックおじさん");
		for(String o:おじさん) {
			System.out.println(o);
		}
	}
}
