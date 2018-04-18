package practice.fundamentals.chapter7.sec4_assert;

/*
 * キーボード入力によって入力された数値が0~6の間でない場合はエラーを表示させてください。
 * ※エラーはassertを使用して発生させること（エラーメッセージは任意）
 */
public class No002 {
	public static void main(String[] args) {

	int c=10;
	num z=new num();
	z.g(c);
	assert z.g(c):"ERRORなんだよなぁ";
	System.out.println(z.g(c));

	}
}
class num{
	int a;
	boolean b;
	public boolean g(int a){
		if(a<0||6<a) {
			return false;
		}else {
			return true;
		}
	}
}
