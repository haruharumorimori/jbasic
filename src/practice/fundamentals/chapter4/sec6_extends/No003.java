package practice.fundamentals.chapter4.sec6_extends;
/*
 * No002のAnimalクラスを継承したDogクラスを作成してください。
 * Dogクラスにはお座りするメソッドを追加してください。
 * mainメソッドでDogクラスをインスタンス化し、犬の名前とお座りしたことを表示させてください。
 */
public class No003 {
	public static void main(String[] args) {
		String name="犬三郎";
		Dog d=new Dog();
		d.setName(name);
		System.out.println(d.getName());
		System.out.println(d.getName()+"は"+d.sit());
	}

}
class Dog extends Animal{
	public String sit(){
		return "お座りしたよ";
	}
}
