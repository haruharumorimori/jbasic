package practice.fundamentals.chapter4.sec1_method;

/*
 * じゃんけんを行うクラスを作成してください。
 * キーボード入力に対して、じゃんけんで「勝ち、負け、あいこ」を表示するプログラムを作成してください。
 */
public class No018 {
	public static void main(String[] args) {
		String a="パー";
		String b="チョキ";
		rsp r=new rsp(a,b);
	}
}

class rsp{
	String a;
	String b;
	rsp(String a,String b) {
		if(a=="パー"&&b=="グー"||a=="チョキ"&&b=="パー"||a=="グー"&&b=="チョキ") {
			System.out.println(a+"の勝ちです。");
		}else if(b=="パー"&&a=="グー"||b=="チョキ"&&a=="パー"||b=="グー"&&a=="チョキ"){
			System.out.println(a+"の負け～＾＾");
		}else {
			System.out.println("あいこ～");
		}
	}
}

