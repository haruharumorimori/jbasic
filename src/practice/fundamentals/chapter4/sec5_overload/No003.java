package practice.fundamentals.chapter4.sec5_overload;
/*
 * 足し算クラスを作成し、mainメソッド内でインスタンス化してください。
 * この際、インスタンス時の引数によって「数値の足し算」「小数点数の足し算」「文字列の結合」を行うように
 * 足し算クラスのコンストラクタを定義してください。
 */
public class No003 {
	public static void main(String[] args) {
		String c="おじいちゃん";
		String d="あばあちゃん";
		add a=new add(c,d);
	}
}

class add{
	add(int a,int b){
		System.out.println(a+b);
	}

	add(double a,double b){
		System.out.println(a+b);
	}

	add(String a,String b){
		System.out.println(a+b);
	}
}
