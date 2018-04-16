package practice.fundamentals.chapter4.sec6_extends;
/*
 * No001クラスにBookクラスを継承してください。
 * また、No001クラス内でsetTitleメソッドを使用して本のタイトルを設定後、
 * getTitleメソッドを使用して設定した本のタイトルを出力するプログラムを作成してください。
 */
public class No001 extends Book {

	public static void main(String[] args) {
		No001 n=new No001();
		String title="Fノホン";
		n.setTitle(title);
		n.getTitle();
		System.out.println("本の名前は："+n.getTitle());
	}
}



class Book {
	String title;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
