package practice.fundamentals.chapter4.sec2_class;
/*
 * No005とは別に、名前・身長・体重などをメンバ（フィールド）としてもつ「人間クラス」を作成してください。
 * ※メソッドはつけてもつけなくても良い
 */
public class No005 {
	public static void main(String[] args) {

		name n=new name();
		tall t=new tall();
		weight w=new weight();
	}
}

class name{
	String name="山田孝之";
	name() {
		System.out.println(name);
	}
}

class tall{
	int t=987;
	tall() {
		System.out.println(t+"cm");
	}
}

class weight{
	int w=678;
	weight() {
		System.out.println(w+"kg");
	}
}
	