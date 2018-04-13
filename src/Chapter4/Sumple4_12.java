package Chapter4;
class StaffTh{
	String name="名無し";
	void setName(String name) {
		System.out.println("name="+name);
		System.out.println("this.name="+this.name);//メソッド内でのthis.変数はメソッド外のインスタンス変数のことを指す
		this.name=name;
	}
}
public class Sumple4_12 {
	public static void main(String[] args) {
		StaffTh s1=new StaffTh();
		System.out.println("----メソッド呼び出し----");
		s1.setName("田中");
	}

}
