package practice.fundamentals.chapter5.sec2_arraylist;

/*
 * ArrayListのコンストラクタ「ArrayList(int initialCapacity) 」を使用して、要素数5の配列を作成してください。
 * 作成したArrayListに、任意の値を6個代入して、拡張for文を使用して1つづつ表示するプログラムを作成してください。
 */
import java.util.ArrayList;
public class No003 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>(5);
		array.add("tanaka");
		array.add("yamada");
		array.add("satou");
		array.add("tomakomai");
		array.add("aaaaaaaa");
		array.add("eeeeeeeeee");
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
	}
}
