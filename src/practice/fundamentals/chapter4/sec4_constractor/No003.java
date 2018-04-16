package practice.fundamentals.chapter4.sec4_constractor;
/*
 * No002とは別に人間クラス「Human」を作成し、mainメソッド内でインスタンス化してください。
 * インスタンス化の際に「あなたのIDは1です。」と表示されるようにコンストラクタを追加してください。
 * また、表示されるID番号はインスタンス化するたびに1ずつインクリメントされるようにしてください。
 */
public class No003 {
	public static void main(String[] args) {
		Human 人間1=new Human();

		人間1.Id();
		System.out.println("あなたのIDは"+人間1.Id());
		int i=1;
		Human 人間2=new Human();
		人間2.Id(i);
		System.out.println("あなたのIDは"+人間2.Id(i));
		i++;
		Human 人間3=new Human();
		人間3.Id(i);
		System.out.println("あなたのIDは"+人間3.Id(i));
	}
}
class Human{

	public int Id() {
		return 1;
	}
	int a;

	public int Id(int a) {
		int b=++a;
		return b;

	}

}