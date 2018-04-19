package practice.fundamentals.chapter4.sec7_override;

/*
 * ユーザクラスを継承した一般ユーザクラスと管理者クラスを作成し、showメソッドをオーバーライドしてください。
 * また、オーバーライドしたshowメソッド内でidとnameに任意の値を代入するように修正してください。
 * 最後に、mainメソッド内でそれぞれのクラスをインスタンス化し、showメソッドを実行するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		publicUser pU=new publicUser();
		Master m=new Master();
		pU.show();
		m.show();
	}
}

class User {
	String name;
	int id;

	void show() {
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}

class publicUser extends User{
	void show() {
		name="田中";
		id=256;
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}
class Master extends User{
	void show() {
		name ="国木田";
		id=1;
		System.out.println("ユーザID：" + id + "ユーザ名：" + name);
	}
}