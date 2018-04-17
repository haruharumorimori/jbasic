package practice.fundamentals.chapter4.sec4_constractor;
/*
 * No002とは別に人間クラス「Human」を作成し、mainメソッド内でインスタンス化してください。
 * インスタンス化の際に「あなたのIDは1です。」と表示されるようにコンストラクタを追加してください。
 * また、表示されるID番号はインスタンス化するたびに1ずつインクリメントされるようにしてください。
 */
public class No003 {
	public static void main(String[] args) {
		Human 人間1=new Human();
		Human 人間2=new Human();
	}
}
class Human{

	static int ID=0;
	Human(){
		ID++;
		System.out.println("あなたのIDは"+ID);

	}

}