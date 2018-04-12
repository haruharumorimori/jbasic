package Chapter4;



class FinTest {
final int a=15;//final指定のインスタンス変数
static final int b=25;//final指定のスタティック変数
static int c=35;//スタティック変数（変更可能）
int d=45;//インスタンス変数
int e;//インスタンス変数です。（デフォルト初期値０が入っている）


void method() {
	int f=10;//ローカル変数（デフォの初期値が入らないので初期化必須）
	System.out.println("a"+a);
	System.out.println("b"+b);
	System.out.println("c"+c);
	System.out.println("d"+d);
	System.out.println("e"+e);
	System.out.println("f"+f);
}
}

public class Sumple4_4{
public static void main(String[] args) {
	//FinTest b=50; //bはfinal指定なので変更できない
	FinTest.c=50;//cは変更可能

	FinTest f =new FinTest();
	f.method();
}
}
