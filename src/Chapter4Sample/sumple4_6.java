package Chapter4Sample;
class OLTest{
void metTest(int a,int b){
	System.out.println("metTest(int a,int b)="+a+"&"+b);
}
void metTest(int a) {
	System.out.println("metTest(inta)="+a);
}
void metTest(double a,double b) {
	System.out.println("metTest(double a,double b)="+a+"&"+b);
}
}
public class sumple4_6 {
	public static void main(String[] args) {
		OLTest ot=new OLTest();
		ot.metTest(25,45);
		ot.metTest(123);
		ot.metTest(2.5,4.5);

	}
}


