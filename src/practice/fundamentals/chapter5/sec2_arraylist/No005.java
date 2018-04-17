package practice.fundamentals.chapter5.sec2_arraylist;

/*
 * データ数が5以上のArrayListを作成し、もしArrayListのサイズが3より大きい場合は、
 * 要素数1~3以外に入っているデータをすべて出力するプログラムを作成してください。
 *
 */
import java.util.ArrayList;
public class No005 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>(5);
		a.add("michel");
		a.add("mike");
		a.add("jenny");
		a.add("falcon");
		a.add("lemy");
		for(int i=3;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
}
