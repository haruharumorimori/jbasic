package practice.fundamentals.chapter10.sec1_list;

/*
 * 次のメソッドを作成してください。
 *
 * <メソッド>
 * 引数：List<Integer>
 * 戻り値：List<String>
 * 処理：引数で受け取ったデータに任意の文字列を足す
 *
 * 作成したメソッドを使用後、コレクション内のデータを1つずつ表示するプログラムを作成してください。
 */
import java.util.ArrayList;
import java.util.List;
public class No007 {
	public static void main(String[] args) {
		List<Integer> t=new ArrayList<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		j(t);
		System.out.println(j(t));
	}
	public static List<String> j(List<Integer> t){
		List<String> s=new ArrayList<String>();
		for(int a:t) {
			s.add("あ"+a);
		}
		return s;
	}
}

