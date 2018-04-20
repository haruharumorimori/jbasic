package practice.fundamentals.chapter10.sec1_list;
/*
 * ArrayListクラスに値を代入し、サイズを出力するプログラムを作成してください。
 */
import java.util.ArrayList;
public class No003 {
	public static void main(String[] args) {
		ArrayList<String> おじさん= new ArrayList<String>();
		おじさん.add("ハイパーおじさん");
		おじさん.add("ギガンティックおじさん");
		おじさん.add("ファイナリティおじさん");
		おじさん.add("スタティックおじさん");
		System.out.println(おじさん.size());
	}
}
