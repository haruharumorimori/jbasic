package Chapter4;
class Staff0v{//スーパークラス
	String name="名無し";
	String getName() {
		return name;
	}
}

class Manager0v extends Staff0v{//サブクラス
	int salary=200;
	int getSaraly() {
		return salary;
	}
	String getName() {//オーバーライド(スーパクラス内のメソッドの機能をサブクラス内で変更したいとき）
		return"【マネージャー】"+name;
	}
}
public class Sumple4_9 {
	public static void main(String[] args) {
		Staff0v s1=new Staff0v();
		System.out.println("-----スーパークラス-----");
		System.out.println("名前："+s1.getName());//スーパークラスで定義したメソッド

		System.out.println();
		Manager0v m1=new Manager0v();
		System.out.println("-----サブクラス-----");
		System.out.println("名前："+m1.getName());//サブクラスで定義したメソッド
		System.out.println("給料："+m1.getSaraly());

	}

}
