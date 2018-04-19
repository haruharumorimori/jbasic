package practice.fundamentals.chapter4.sec2_class;
/*
 * No003クラスとは別に、四角形を表すクラスを定義してください。
 * フィールドに縦と横の長さをint型で持つようにします。
 * メソッドとして面積を返すメソッドを定義してください。
 * No003クラスのmainメソッドで四角形クラスをインスタンス化し、面積を表示させるプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {
		Square1 s=new Square1();
		int 縦=11;
		int 横=22;
		s.m(縦, 横);
	}
}

class Square1{
	int side;
	int high;

	public void  m(int high,int side){
		int result = side*high;
		System.out.println(result);
	}
}
