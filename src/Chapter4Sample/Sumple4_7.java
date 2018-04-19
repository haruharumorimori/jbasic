package Chapter4Sample;
class Trainer{
	String name;
	int age;
	Trainer(){//コンストラクタの定義
		name="名無し";
		age=123456789;
	}
	Trainer(String n,int a){//コンストラクタのオーバーロード
		name=n;
		age=a;
	}
}

public class Sumple4_7 {
	public static void main(String[] args) {

		//名無しオブジェクトをインスタンス化
		Trainer s1=new Trainer();

		//田中オブジェクトをインスタンス化
		Trainer s2=new Trainer("コテハンシネ",5609);

		//名前を表示
		System.out.println("name:"+s1.name+" 年齢:"+s1.age+"歳");
		System.out.println("name:"+s2.name+" 年齢:"+s2.age+"歳");
	}

}
