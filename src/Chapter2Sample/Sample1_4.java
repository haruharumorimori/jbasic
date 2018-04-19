package Chapter2Sample;

public class Sample1_4 {
	public static void main (String[] args) {
		int[] hage = new int [5];

hage[0] =12 ;
hage[1] = 3;
hage[2] = 28;
hage[3] = 427;
hage[4] = 33;

System.out.println("hage[0]の値は" + hage[0] + "です。");
System.out.println("hage[1]の値は" + hage[1] + "です。");
System.out.println("hage[2]の値は" + hage[2] + "です。") ;
int len = hage.length;

System.out.println("配列hageの要素の数は" + len + "です。" );

String[] shage = {"One","Two","Three"};

System.out.println("shage[0]の値は" + shage[0] + "です。" );
System.out.println("shage[1]の値は" + shage[1] + "です。" );
System.out.println("shage[2]の値は" + shage[2] + "です。" );
int len1 = shage.length;

System.out.println("配列shageの要素の数は" + len1 + "です。" );

String[] primary = {"一","二","三"};
System.out.println("primary[0]の値は" + primary[0] + "です。" );
System.out.println("primary[1]の値は" + primary[1] + "です。" );
System.out.println("primary[2]の値は" + primary[2] + "です。" );
int papapa = primary.length;

System.out.println("配列primaryの要素の数は" + papapa + "です。" );

double[] pa = new double[5];
pa[0] = 0.1;
pa[1] = 0.25;
pa[2] = 1.289;
pa[3] = 18.989;
pa[4] = 10089.899;

System.out.println("pa[0]の値は" + pa[0] + "です。" );
System.out.println("pa[1]の値は" + pa[1] + "です。" );
System.out.println("pa[2]の値は" + pa[2] + "です。" );
System.out.println("pa[3]の値は" + pa[3] + "です。" );
System.out.println("pa[4]の値は" + pa[4] + "です。" );

double papa = pa.length;

System.out.println("配列paの要素の数は" + papa + "です。" );


	}
}