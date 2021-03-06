package practice.fundamentals.chapter0;
import java.util.ArrayList;
/*
 * クラス SeitoScore をつくり、名前と、点数をメンバー変数に持たせてください。
 * メソッドには名前と点数を出力するメソッドを作り、コンストラクタで生徒名と点数を設定するようにしてください。
 * No010を使って５人の生徒の情報を管理し、５０点以上の生徒だけを表示するプログムを作成してください。
 * ※Listクラスを必ず使用すること
 */
public class No010 {
	public static void main(String[] args) {
		SeitoScore s1=new SeitoScore("山田",36);
		SeitoScore s2=new SeitoScore("田中",59);
		SeitoScore s3=new SeitoScore("斎藤",78);
		SeitoScore s4=new SeitoScore("竹中",89);
		SeitoScore s5=new SeitoScore("城之内",90);
		ArrayList<SeitoScore> a=new ArrayList<SeitoScore>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		for(SeitoScore b:a) {
			if(b.getScore()>50){
				System.out.println(b.getName());
				System.out.println(b.getScore());
			}
		}
	}
}

class SeitoScore{
	String name;
	int score;
	SeitoScore(String n,int s){
		this.name=n;
		this.score=s;
		}
	String getName() {
		return this.name;
	}
	int getScore() {
		return this.score;
	}
}
