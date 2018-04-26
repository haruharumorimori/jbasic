package practice.fundamentals.chapter10.sec2_map;
/*
 * HashMapを作成し、任意のキーと値を代入してください。
 * その後、コレクションのサイズを取得して表示させるプログラムを作成してください。
 */
import java.util.HashMap;
public class No004 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("ご", "り");
		hm.put("ら", "は");
		hm.put("友","達");
		System.out.println(hm.size());


	}
}
