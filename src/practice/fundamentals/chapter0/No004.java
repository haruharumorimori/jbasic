package practice.fundamentals.chapter0;
/*
 * 次の従業員クラスを作成し、コンストラクタで名前と入社日を設定できるようにしてください。
 * mainメソッド内で3人の従業員を生成し、それぞれの名前と入社日を出力するプログラムを作成してください。
 * <フィールド>
 * ・名前
 * ・入社日
 */
import java.time.LocalDate;
public class No004 {
	public static void main(String[] args) {
		Employee e1=new Employee("田中",2018,4,1);
		Employee e2=new Employee("佐村河内",2018,4,14);
		Employee e3=new Employee("山村",2018,9,9);
		System.out.println("名前："+e1.name+"入社日"+e1.LD);
		System.out.println("名前："+e2.name+"入社日"+e2.LD);
		System.out.println("名前:"+e3.name+"入社日"+e3.LD);
	}
}
class Employee{
	String name;
	int a;
	int b;
	int c;
	LocalDate LD;
	Employee(String n,int a,int b,int c){
		name=n;
		LD=LocalDate.of(a, b, c);
	}
}
