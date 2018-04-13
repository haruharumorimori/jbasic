package practice.fundamentals.chapter4.sec2_class;
/*
 * No001とは別にクラスを定義してNo001クラスのmainメソッド内で定義したクラスをインスタンス化してください。
 * ※クラス名などは任意とする
 */
class ゴリラ{
		static String name="ドンキーコング";
	public static String getGolilla(){
		return name;
}
}
public class No001 {
	public static void main(String[] args) {
		ゴリラ g=new ゴリラ();
		String name=ゴリラ.getGolilla();
		System.out.println("僕の友達"+name+"!");

		}
	}


