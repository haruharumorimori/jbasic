package practice.fundamentals.chapter10.sec2_map;
/*
 * HashMapを使用してキーに文字列、値に数値を代入してコレクションを作成してください。
 * その後、任意のキーを指定して値を取得して表示するプログラムを作成してください。
 */
import java.util.HashMap;
public class No003 {
	public static void main(String[] args) {
	HashMap<Integer,String> s=new HashMap<Integer,String>();
	s.put(1, "霊長類");
	s.put(2,"哺乳類");
	s.put(3,"昆虫");
	System.out.println(s.get(1));
	}
}
