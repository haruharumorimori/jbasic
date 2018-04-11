package practice.fundamentals.chapter2.sec5_for;
/*
 * 次のように画面に表示するプログラムをfor文を使って作成してください。
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */
public class No007 {
	public static void main(String[] args) {


	String[] array= new String[5];
	array[0]="*";
	array[1]="**";
	array[2]="***";
	array[3]="****";
	array[4]="*****";
for(int i=0;i<=4;i++) {
System.out.println(array[i]);
	}
	}
}
