package practice.fundamentals.chapter7.sec4_assert;
/*
 * int型変数xに10を代入し、xが10の場合はエラーを表示するような
 * プログラムをassertを使用してを作成してください。
 * また、エラー時のメッセージには「値が不正です。」と表示されること
 */
public class No001 {
	public static void main(String[] args) {
		int x=10;
		b d=new b();
		assert d.ch():"値が不正です。";
		System.out.println(x);
	}
}
class b{
	public boolean ch() {
		return false;
	}
}
