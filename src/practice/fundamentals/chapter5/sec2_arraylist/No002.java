package practice.fundamentals.chapter5.sec2_arraylist;
/*
 * 次のデータをArrayListに格納してください。
 * 格納後に、田中二郎をremoveメソッドを使用して削除してください。
 * 最後に拡張for文を使用して「名前：○○○○」と表示されるプログラムを作成してください。
 * ・山田太郎
 * ・田中二郎
 * ・松下花子
 */
import java.util.ArrayList;
public class No002 {
	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>(3);
	name.add("山田太郎");
	name.add("田中二郎");
	name.add("松下花子");
	name.remove(1);
	for(int i=0;i<name.size();i++) {
		System.out.println("名前:"+name.get(i));
		}
	}
}
