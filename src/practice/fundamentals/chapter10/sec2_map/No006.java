package practice.fundamentals.chapter10.sec2_map;
import java.util.HashMap;
/*
 * 2つの引数（int key , String value）を持つメソッドputMapを作成してください。
 * 引数で受け取った値は、HashMapクラスを使用して格納して戻り値として返すようにしてください。
 * mainメソッド内でそのメソッドを使用し、最後に値を表示するプログラムを作成してください。
 */
public class No006 {
	public static void main(String[] args) {
		putMap(1, "おかん");
		putMap(2, "オトン");
		putMap(3, "おにい");

		System.out.println(putMap(1,"おかん"));
	}
	public static HashMap<Integer,String> putMap(int a,String b){
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(a,b);
		return hm;
	}
}

