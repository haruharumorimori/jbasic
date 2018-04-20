package practice.fundamentals.chapter10.sec2_map;

/*
 * 2つの引数（int key , String value）を持つメソッドputMapを作成してください。
 * 引数で受け取った値は、HashMapクラスを使用して格納して戻り値として返すようにしてください。
 * mainメソッド内でそのメソッドを使用し、最後に値を表示するプログラムを作成してください。
 */
import java.util.HashMap;
public class No002 {
	public static void main(String[] args) {
		int a=0;
		String b="gollira";
		putMap(a,b);
		System.out.println(putMap(a,b));
	}
	int key;
	String value;
	public static HashMap<Integer,String> putMap(int key,String value){
		HashMap<Integer,String> HM=new HashMap<Integer,String>();
		HM.put(key, value);
		return HM;
	}
}


