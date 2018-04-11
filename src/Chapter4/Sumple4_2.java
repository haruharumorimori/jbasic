package Chapter4;

public class Sumple4_2 {
	public static void main(String[] args) {
		Staff s=new Staff();//インスタンス化
		//String name=s.getName();
		String name =Staff.getName();
		System.out.println("スタッフ名:"+name);

	}
}






//スタッフクラス
class Staff{
	static String name ="山田";//インスタンス変数

public static String getName() {
	return name;
}
}

