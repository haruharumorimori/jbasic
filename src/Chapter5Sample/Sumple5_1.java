package Chapter5Sample;

public class Sumple5_1 {
	public static void main(String[] args) {//配列の宣言
		int[] lar=new int[5];
		//int[] lar =new int[] 初期値を入力してください、とエラーが出ます。
		lar[0]=12;//配列の初期化
		lar[1]=3;//異なるデータ型の代入はコンパイルエラーとなります。
		lar[2]=28;
		//lar[2]=2.25;
		lar[3]=427;//確保した領域外への代入は実行時エラーとなります。
		lar[4]=33;
		//lar[5]=15;

		System.out.println("lar[0]の値は"+lar[0]+"です。");//表示
		System.out.println("lar[1]の値は"+lar[1]+"です。");
		System.out.println("lar[2]の値は"+lar[2]+"です。");

		String[] sar= {"one","two","three"};//配列の宣言と初期化

		System.out.println("sar[0]の値は"+sar[0]+"です。");//表示
		System.out.println("sar[1]の値は"+sar[1]+"です。");
		System.out.println("sar[2]の値は"+sar[2]+"です。");
		int len=sar.length;//配列の要素数を取得
		int len2=lar.length;
		System.out.println("配列sarの要素数は"+len+"です。");//表示
		System.out.println("配列larの要素数は"+len2+"です。");
	}

}
