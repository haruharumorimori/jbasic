package practice.fundamentals.chapter4.sec4_constractor;
/*
 * No001クラスとは別に下記のような車クラスを作成してください。
 *
 * <フィールド>
 * ・ガソリン
 *
 * <メソッド>
 * ガソリンを使用して走る機能
 * 現在の残ガソリンを確認する機能
 * 給油する機能
 *
 * <コンストラクタ>
 * ・ガソリンの初期値を指定する
 */
public class No001 {
	public static void main(String[] args) {

int g=80;
Car 車1=new Car(g);

System.out.println("残ガス"+車1.getGas()+"l");

int o=20;
System.out.println(車1.chargeGas(o)+"入りました!!!!!!!!!!!!");
	}
}

class Car{
	int gas=200;
	Car(int gas) {
		this.gas-=gas;
		System.out.println(gas*10+"km走行したよ!");
	}
	public int getGas(){
		return this.gas;
	}
	
	int oil;
	public int chargeGas(int oil){
	return oil;
	}
}
