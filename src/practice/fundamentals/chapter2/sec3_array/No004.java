package practice.fundamentals.chapter2.sec3_array;
/*
 * 要素型がdoubleで要素数が5の配列を生成して、その全要素を表示するプログラムを作成してください。
 */
public class No004 {
	public static void main(String[] args) {
		double[] i=new double[5];
		i[0]=1.1;
		i[1]=1.2;
		i[2]=1.3;
		i[3]=1.4;
		i[4]=1.5;

for(int s1=0;s1<i.length;s1++){
System.out.println(i[s1]);
}



	}
}
