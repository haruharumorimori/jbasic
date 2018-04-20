package practice.fundamentals.chapter0;
/*
 * 以下のフィールドを保持したユーザクラスを作成し、getter/setterを定義してください。
 * また、mainメソッド内で各フィールドに任意の値をセットして画面へ出力するプログラムを作成してください。
 * <フィールド>
 * ・ユーザID
 * ・ユーザ名
 * ・パスワード
 */
public class No002 {
	private int ID;
	private String name;
	private String pass;
	public static void main(String[] args) {
		No002 n=new No002();
		n.setID(4263);
		n.setName("田中義武");
		n.setPass("yoshitake45646");
		System.out.println(n.getID());
		System.out.println(n.getName());
		System.out.println(n.getPass());
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}