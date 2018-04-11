package Chapter2;

import java.util.Scanner;

public class Sumple1_7 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String str= scan.next();


		int i =scan.nextInt();

		int a=i*10;

		//出力
		System.out.println(str);
		System.out.println(a);


		scan.close();
	}
}
