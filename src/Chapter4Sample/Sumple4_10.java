package Chapter4Sample;
class StaffSsp{
	String name="名無し";
	StaffSsp(){
		System.out.println("スーパークラス　名前："+name);
	}
	StaffSsp(String n){
		name=n;
		System.out.println("スーパークラス　名前："+name);

	}
}
class ManagerSsp extends StaffSsp{
	ManagerSsp(){
		System.out.println("サブクラス　名前:"+name);
	}
	ManagerSsp(String n){
		super(n);//スーパーコンストラクタの呼び出し
		System.out.println("サブクラス　名前:"+name);
	}
}
public class Sumple4_10 {
	public static void main(String[] args) {
		System.out.println("-----引数なしのコンストラクタ-----");
		ManagerSsp m1=new ManagerSsp();

		System.out.println();
		System.out.println("-----引数ありのコンストラクタ-----");
		ManagerSsp m2=new ManagerSsp("佐藤");
	}

}
