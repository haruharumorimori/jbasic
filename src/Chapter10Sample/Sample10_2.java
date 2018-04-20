package Chapter10Sample;

import java.util.HashMap;
import java.util.Map;

public class Sample10_2 {
	public static void main(String[] args) {
		//mapコレクション作成
		Map<Integer,String> map=new HashMap<Integer,String>();

		//キーと格納
		map.put(1,"カレー");
		map.put(2, "うどん");
		map.put(1, "オムライス");
		//サイズゲット
		System.out.println("コレクションのサイズ:"+map.size());
		//全容出力
		System.out.println(map);
		//for文で一個ずつ（値のみ）
		for(String value:map.values()) {
			System.out.println(value);
		}
		//for文で一個ずつ（キーと値)
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println("キー："+entry.getKey()+" 値:"+entry.getValue());
		}
	}
}
