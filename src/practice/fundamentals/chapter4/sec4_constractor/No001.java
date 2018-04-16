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


Car 車1=new Car();
int g=80;
車1.run(g);
System.out.println("残ガス"+車1.getGas()+"l");
System.out.println(車1.chargeGas(g)+"入りました!!!!!!!!!!!!");

	}
}

class Car{
	int gas=200;
	public void run(int gas) {
		this.gas-=gas;
		System.out.println(gas*10+"km走行したよ!");
	}
	public int getGas(){

	return this.gas;
	}
	public int chargeGas(int gas){

		return gas;
	}

}
