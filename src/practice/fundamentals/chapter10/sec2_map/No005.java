package practice.fundamentals.chapter10.sec2_map;
import java.util.HashMap;
/*
 * Mapクラスを使用してキーに国名（日本語）、対応する値に国名（英語）を入れてください。
 * その後、キーに対する値を取得して表示させるプログラムを作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String, String>();
		hm.put("露","Russia");
		hm.put("米", "America");
		hm.put("中", "China");
		System.out.println(hm.get("中"));
	}
}