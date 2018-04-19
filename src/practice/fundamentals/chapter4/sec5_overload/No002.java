package practice.fundamentals.chapter4.sec5_overload;
/*
 * 同一の名前を持つメソッドを定義し、それぞれ任意の処理をするプログラムを作成してください。
 */
class action{
	String name;
	action (){
		name="名無しさん";
	}
	action (String n){
		name=n;
	}
}

public class No002 {
	public static void main(String[] args) {
		action a1=new action();
		System.out.println("貴殿の名は:"+a1.name);
		action a2=new action("ジャッキーチェン2");
		System.out.println("貴殿の名は:"+a2.name);
	}
}
