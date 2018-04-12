package practice.fundamentals.chapter2.sec7_switch;
/*
 * 0~6の数字を入力すると、その数字に対応した曜日が出力されるプログラムを作成してください。
 * 0~6のどの数字にどの曜日が対応するかは任意とする。
 */
public class No002 {
	public static void main(String[] args) {
		int i=0;
		int[] n=new int[i];
		n[0]=0;
		n[1]=1;
		n[2]=2;
		n[3]=3;
		n[4]=4;
		n[5]=5;
		n[6]=6;

		switch(i) {
		case 0:
			System.out.println("月曜");
		case 1:
			System.out.println("火曜");
		case 2:
			System.out.println("水曜");
		case 3:
			System.out.println("木曜");
		case 4:
			System.out.println("金曜");
		case 5:
			System.out.println("土曜");
		case 6:
			System.out.println("日曜");
		}



		}
}
