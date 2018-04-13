package practice.fundamentals.chapter4.sec2_class;
/*
 * No002とは別に「車」を表すクラスを定義してください。
 * フィールドやメソッドは任意に必ず1つ以上は定義するようにしてください。
 * また、No002クラスのmainメソッド内で車クラスをインスタンス化し、定義したメソッドを使用してみてください。
 */
public class No002 {
public static void main(String[] args) {
	ぶーぶー c=new ぶーぶー();
	String name=ぶーぶー.getCar();
	System.out.println("それ僕の"+name);
}
}

class ぶーぶー{
	public static String name="レクサス";
	public static String getCar() {
		return name;
	}
}
