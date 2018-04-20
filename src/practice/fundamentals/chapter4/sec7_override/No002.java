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
		System.out.println("漫画BOOKの価格"+m.showPrice());
		System.out.println("小説BOOKの価格"+s.showPrice());
		System.out.println("雑誌BOOKの価格"+z.showPrice());
	}
}

class Book {
	int price=500;  // 価格
	int showPrice() {
		return price;
	}
}

class 漫画 extends Book{
	public int showPrice() {
	int price=300;
	return price;
		}
}

class 小説 extends Book{
	public int showPrice() {
	int price=400;
		return price;
	}
}

class 雑誌 extends Book{
	public int showPrice() {
	int price=600;
		return price;
	}
}