package Chapter5Sample;
import java.util.ArrayList;//import宣言
public class Sumple5_4 {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();//初期値なし
		//Integerはint型を参照クラスとして扱うクラス名。他にもいろいろある。これらの通称をラッパークラスという。
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);

		num.remove(1);//指定した要素を削除できるメソッド
		for(int i=0;i<num.size();i++) {//ArrayListは.lengthではなく.size()
			System.out.println(num.get(i));
		}
	}
}
