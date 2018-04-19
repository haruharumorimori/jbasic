package practice.fundamentals.chapter4.sec7_override;

/*
 * Bookクラスを継承した漫画クラス、小説クラス、雑誌クラスを作成してください。
 * showPriceメソッドをオーバーライドして、それぞれ以下の価格で表示されるようにメソッド内の処理を書き換えてください。
 * 最後に、mainメソッド内でそれぞれの価格を表示させてください。
 *
 * <価格設定>
 * 漫画：Bookの価格 - 200
 * 小説：Bookの価格 - 100
 * 雑誌：Bookの価格 + 100
 */
public class No002 {
	public static void main(String[] args) {
		漫画 m=new 漫画();
		小説 s=new 小説();
		雑誌 z=new 雑誌();
		m.showPrice();
		s.showPrice();
		z.showPrice();
	}
}

class Book {
	int price = 500;  // 価格
	void showPrice() {
		System.out.println(price + "円");
	}
}

class 漫画 extends Book{
	void showPrice() {
	price=300;
		System.out.println("漫画:Bookの価格"+price+"円");
	}
}

class 小説 extends Book{
	void showPrice() {
	price=400;
		System.out.println("小説:Bookの価格"+price+"円");
	}
}

class 雑誌 extends Book{
	void showPrice() {
	price=600;
		System.out.println("雑誌:Bookの価格"+price+"円");
	}
}