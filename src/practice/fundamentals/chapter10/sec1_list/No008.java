package practice.fundamentals.chapter10.sec1_list;
/*
 * 次のBookをインスタンス化した際にコンストラクタでタイトルと価格を設定して3冊の本を作成してください。
 * ただし、今回はArrayListのaddメソッド内でコンストラクタを呼び出すようにしてください。
 * その後、3冊のタイトルと価格を出力するプログラムを作成してください。
 */
import java.util.ArrayList;
public class No008 {
	public static void main(String[] args) {
		Book b1=new Book("Fノホン書の１巻",300);
		Book b2=new Book("おじさんの本",29800);
		Book b3=new Book("ソバは飲み物",2980);
		ArrayList<Book> Info=new ArrayList<Book>();
		Info.add(b1);
		Info.add(b2);
		Info.add(b3);


		System.out.println("本の名前は"+Info.get(0).getTitle()+" "+Info.get(0).getPrice()+"円");
	}
}

class Book {
	String title;    // タイトル
	int price;       // 価格

	// コンストラクタ
	Book(String title, int price) {
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