package practice.fundamentals.chapter0;
import java.util.ArrayList;
/*
 * 買い物リストクラスを作成し、「No」と「名称」と「価格」をメンバ変数に持たせ、コンストラクタで各メンバ変数の値を設定するようにしてください。
 * また、メソッドには各メンバの値を設定するメソッド（setter）と、取得するメソッド（getter）を作成してください。
 * No011クラスで買い物リストを完成させ、100円以上のものと100円より下のもので分けて表示するようにしてください。
 */
public class No011 {
	public static void main(String[] args) {
		buy b1=new buy();
		b1.setNo(1);
		b1.setName("tomato");
		b1.setMuch(250);
		buy b2=new buy();
		b2.setNo(2);
		b2.setName("kyuuri");
		b2.setMuch(20);
		ArrayList<buy> buyb=new ArrayList<buy>();
		buyb.add(b1);
		buyb.add(b2);
		for(buy s:buyb) {
			if(s.getMuch()>100) {
				System.out.println(s.getNo());
				System.out.println(s.getName());
				System.out.println(s.getMuch());
			}
		}
	}
}

class buy{
	int No;
	String name;
	int much;

	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		this.No = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMuch() {
		return much;
	}
	public void setMuch(int much) {
		this.much = much;
	}
}
