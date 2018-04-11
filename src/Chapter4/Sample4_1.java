package Chapter4;
//クラスブロックスタート
public class Sample4_1 {//xはインスタンス変数です
	int x=2;//インスタンス変数（フィールド）
	
	//メソッドブロックスタート
	void add() {
	int y=5;//ローカル変数
	System.out.println(x+y);
	}
	//メソッドブロックエンド
	
	//メソッドブロックスタート
	void scopeSample() { 
	for(int i=0;i<x;i++) {
	//System.out.println(ｙ);
		System.out.println(i);
	}
	}
	//メソッドブロックエンド
	}
//クラスブロックエンド
