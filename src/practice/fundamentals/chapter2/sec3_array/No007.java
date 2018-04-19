package practice.fundamentals.chapter2.sec3_array;
/*
 * int型の配列を作成し、10,20,30,40,50を代入し、
 * 配列から値を1つずつ取り出して出力するプログラムを作成してください。
 */
public class No007 {
	public static void main(String[] args) {
		int[] i=new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;

		for(int s=0;s<5;s++) {
			System.out.println(i[s]);
		}
	}
}