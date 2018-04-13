package practice.fundamentals.chapter4.sec2_class;
/*
 * No004クラスとは別に以下内容で本クラスを作成してください
 * また、mainメソッドから本クラスのオブジェクトを1つ生成してそれぞれの本の情報を表示するプログラムを作成してください。
 *
 * <フィールド>
 * ・本のタイトル
 * ・著者
 * ・価格
 *
 * <メソッド>
 * ・本のタイトル取得
 * ・著者情報取得
 * ・価格取得
 *
 */
public class No004 {
	public static void main(String[] args) {
	book b=new book();
	String a1="Fの本";
	String b1="F森";
	int c1=2018;
	b.bn(a1);
	b.wn(b1);
	b.m(c1);




	}
}
class book{
	static String bookname;
		public void bn(String bookname){
			System.out.println("本:"+bookname);
	}
	static String writername;
		public void wn(String writername) {
			System.out.println("著者:"+writername);
	}
	static int money;
		public void m(int money) {
			System.out.println(money+"円");
		}


}

