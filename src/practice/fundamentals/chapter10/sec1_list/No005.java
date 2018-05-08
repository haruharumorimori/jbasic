package practice.fundamentals.chapter10.sec1_list;

import java.util.ArrayList;

/*
 * 次のBookをインスタンス化した際にコンストラクタでタイトルと価格を設定して3冊の本を作成してください。
 * ただし、今回はArrayListのaddメソッド内でコンストラクタを呼び出すようにしてください。
 * その後、3冊のタイトルと価格を出力するプログラムを作成してください。
 */
public class No005 {
	public static void main(String[] args) {
		Book23 b1=new Book23("a",280);
		Book23 b2=new Book23("b",370);
		Book23 b3=new Book23("c",480);
		ArrayList<Book23> mo=new ArrayList<Book23>();
		mo.add(b1);
		mo.add(b2);
		mo.add(b3);
		for(Book23 c:mo) {
			System.out.println(c.getPrice());
			System.out.println(c.getTitle());
		}

	}

}

class Book23{
	String title;    // タイトル
	int price;       // 価格

	// コンストラクタ
	Book23(String title, int price) {
		this.title = title;
		this.price = price;
	}

	// getter/setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
