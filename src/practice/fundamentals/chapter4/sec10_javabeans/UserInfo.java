package practice.fundamentals.chapter4.sec10_javabeans;
/*
 * 次のユーザ情報クラスをJavaBeans仕様にしてください。
 */
public class UserInfo implements java.io.Serializable{
	private String name;
	public UserInfo() {}
	public UserInfo(String name) {
		this.name=name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
}
