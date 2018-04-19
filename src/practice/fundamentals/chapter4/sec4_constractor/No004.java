package practice.fundamentals.chapter4.sec4_constractor;
/*
 * 次のようなフルーツクラスを作成してください。
 * <フィールド>
 * ・甘さ
 * ・色
 * ・大きさ
 *
 * <メソッド>
 * ・甘さを表示する
 * ・色を表示する
 * ・大きさを表示する
 *
 * このフルーツクラスをインスタンス化した際に、甘さ、色、大きさをコンストラクタによって初期化し、
 * その後甘さ、色、大きさをそれぞれ表示するプログラムを作成してください。
 *
 */
public class No004 {
	public static void main(String[] args) {
		甘さ a=new 甘さ();
		色 c=new 色();
		大きさ o=new 大きさ();
	}
}

class 甘さ{
	String a="めっちゃ甘い";
	甘さ(){
		System.out.println(a);
	}
}

class 色{
	String c="血みたいな色";
	色(){
		System.out.println(c);
	}
}

class 大きさ{
	String s="ティラノサウルス級";
	大きさ(){
		System.out.println(s);
	}
}

