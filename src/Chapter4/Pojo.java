package Chapter4;
public class Pojo implements java.io.Serializable{
	private String name;//フィールドの宣言はpivate

	public Pojo() {}//コンストラクタ（デフォルト）
	public Pojo(String name) {//コンストラクタ（オーバーロード）
		this.name=name;
	}

	/*アクセス用関数（setter/getter)*/
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
}
