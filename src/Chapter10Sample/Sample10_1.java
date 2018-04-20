package Chapter10Sample;

import java.util.ArrayList;
import java.util.List;
public class Sample10_1 {
	public static void main(String[] args) {
		//リストコレクションの生成
		List<String> ist=new ArrayList<String>();
		List<String> ist2=new ArrayList<String>();

		//リストへの値格納
		ist.add("りんご");
		ist.add("ごりら");
		ist.add("らっぱ");

		ist2.add("food");
		ist2.add("animal");
		ist2.add("instrumental");
		//リストサイズget
		System.out.println("コレクションのサイズ:"+ist.size());

		//リスト全部一遍に出力
		System.out.println(ist);

		//for文で全部一個ずつ出力
		for(String s:ist) {
			System.out.println(s);
			switch(s) {
			case "りんご":
			System.out.println(ist2.get(0));
			break;
			case "ごりら":
			System.out.println(ist2.get(1));
			break;
			case "らっぱ":
			System.out.println(ist2.get(2));
			}
			System.out.println("↓");
		}
	}
}
