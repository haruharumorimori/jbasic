package practice.fundamentals.chapter4.sec4_constractor;
/*
 * インスタンス化した際に、「Hello」と表示するクラス「Hello」を作成し、
 * mainメソッド内でインスタンス化してください。
 */
public class No002 {
	public static void main(String[] args) {
		Hello h=new Hello();
		h.sayHello();
				}
}
class Hello{
	public void sayHello(){
		System.out.println("Hello");
	}
}
