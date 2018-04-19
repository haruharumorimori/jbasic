package Chapter4Sample;
abstract class AbsStaff{//アブストラクトクラス宣言
	String name="名無し";
	String getName() {//通常のメソッドも定義可能
		return name;
	}
	abstract int getSalary();//抽象メソッド
}
class ManagerAbs extends AbsStaff{//アブストラクトメソッドを継承したクラス
	int salary=5000000;
	@Override
	int getSalary () {//abstractメソッド実装
		return salary;
	}
	@Override
	String getName() {
		return "【マネージャー】"+super.getName();
	}
}


public class Sumple4_13 {
	public static void main(String[] args) {
		ManagerAbs m1=new ManagerAbs();
		System.out.println("名前："+ m1.getName());
		System.out.println("給与:"+m1.getSalary());
	}

}
