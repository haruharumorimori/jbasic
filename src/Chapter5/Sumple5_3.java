package Chapter5;
import java.util.ArrayList;//インポート宣言

public class Sumple5_3 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>(3);//配列の宣言

		array.add("田中");//値の追加
		array.add("鈴木");
		array.add("高橋");
		array.remove(2);
		for(int i=0;i<array.size();i++) {
		System.out.println(array.get(i));//値の取り出し
		}
	}
}
