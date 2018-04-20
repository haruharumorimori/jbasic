package practice.fundamentals.chapter0;
/*
 * 電話の抽象クラスを作成し、それを継承したiPhoneクラスとAndroidクラスを作成してください。
 * 電話の抽象クラス内で1つ以上のabstractメソッドを定義し、iPhone、Android側でオーバーライドしてください。
 * また、iPhone、Androidクラスでそれぞれ1つ以上オーバーライドしたメソッドを定義してください。
 * 最後にmainメソッドでそれぞれに定義したメソッドを使用して画面に出力するプログラムを作成してください。
 */
import java.time.LocalDateTime;
abstract class CellPhone{
	abstract String gettellName();

	LocalDateTime ldt=LocalDateTime.now();
	public void time(){
		System.out.println(ldt);
	}
}
public class No003 {
	public static void main(String[] args) {
		Android a=new Android();
		Iphone i=new Iphone();
		System.out.println(a.gettellName());
		a.time();
		System.out.println(i.gettellName());
		i.time();
	}
}

class Android extends CellPhone{
	String name="佐藤";
	public String gettellName() {
		return name;
	}
	public void time() {
		System.out.println(ldt);
	}
}

class Iphone extends CellPhone{
	String name="中島";
	public String gettellName() {
		return name;
	}
	public void time() {
		System.out.println(ldt);
	}
}
