package practice.fundamentals.chapter4.sec10_javabeans;
/*
 * 次の本クラスをJavaBeans仕様にしてください。
 */
public class Book implements java.io.Serializable {
	private String name;

	public Book() {}
	public Book(String name) {
		this.name=name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
}
