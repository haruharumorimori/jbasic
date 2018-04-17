package practice.fundamentals.chapter4.sec9_abstract;
/*
 * 抽象クラスとして動物クラスを定義し、動物クラス内に鳴くというメソッド作成してください。
 * 作成した抽象クラスを使用して、鳴き声を出力するプログラムを作成してください。
 */
public class No001 {
	public static void main(String[] args) {
Lion l=new Lion();
System.out.println(l.a);
	}
}
abstract class 動物{
	abstract String getVoice();
}

class Lion extends 動物{
	String a=" gaooooooo!";
	String getVoice(){
		return a;
	}
}

