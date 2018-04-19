package Chapter4Sample;
class StaffTs{
	StaffTs(){//引数なしコンストラクタ
		this("佐藤");
	}
	StaffTs(String name){//引数ありコンストラクタ
		System.out.println("名前:"+name);
	}
	void methodM1(){
		System.out.println("メソッドM1");
	}
	void methodM2() {
		this.methodM1();
		System.out.println("メソッドM2");
	}
}
class Sumple4_11{
	public static void main(String[] args) {
		System.out.println("----コンストラクタ呼び出し----");
		StaffTs s1=new StaffTs();
		System.out.println("----メソッド呼び出し----");
		s1.methodM2();
	}
}