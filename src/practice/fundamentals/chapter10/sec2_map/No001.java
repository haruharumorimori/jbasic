package practice.fundamentals.chapter10.sec2_map;

/*
 * Mapクラスを使用してキーに国名（日本語）、対応する値に国名（英語）を入れてください。
 * インデックスを指定してキーに対する値を取得して表示させるプログラムを作成してください。
 */
import java.util.HashMap;
public class No001 {
	public static void main(String[] args) {
		HashMap<String,String> HM=new HashMap<String,String>();
		HM.put("ウズベキスタン", "Uzbekistan");
		HM.put("トルクメニスタン","Trukmenistan");
		HM.put("ルクセンブルク", "Luxenbourg");
		String value=HM.get("ウズベキスタン");
		System.out.println(value);
	}
}