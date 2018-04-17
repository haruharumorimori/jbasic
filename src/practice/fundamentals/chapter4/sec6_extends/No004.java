package practice.fundamentals.chapter4.sec6_extends;
/*
 * 好きなスーパークラスと、そのスーパークラスを継承したサブクラスを作成してください。
 * また、それぞれに好きなフィールドとメソッドを追加してください。
 * 最後にNo004クラスのmainメソッドでサブクラスをインスタンス化して処理を実行するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		GrandMother gm=new GrandMother();

		System.out.println("彼の名前は"+gm.Human());
			System.out.println("おばあちゃんは言いました「"+gm.GrandMother()+"」");
	}
}
class Human{
	String name;
	 String Human(){
		 name="かんた";
		 return name;
	}
}
class GrandMother extends Human{
	String say="かんたあああああああ！！";
	String GrandMother(){
		say="かんたあああああああ！！";
		return say;
	}

}
