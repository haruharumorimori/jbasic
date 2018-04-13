package Chapter4;
class Satff{//スーパークラス
	String name;
	String getName() {
		name="名無し";
		return name;
	}
	String getName(String n) {
		name=n;
		return name;
	}

}
class Manager extends Satff{//サブクラス
	int salary=50000000;
	int getSalary() {
		return salary;
	}
}

 class Sumple4_8 {
	public static void main(String[] args) {
		Manager m1=new Manager();//サブクラスのインスタンス化

		System.out.println("名前"+m1.getName());//スーパークラスで定義したメソッドの呼び出し
		System.out.println("給料"+m1.getSalary());//サブクラスで定義したメソッドの呼び出し



	}

}
