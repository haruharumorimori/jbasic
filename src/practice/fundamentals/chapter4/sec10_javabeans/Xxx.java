package practice.fundamentals.chapter4.sec10_javabeans;
/*
 * UserInfoクラスのフィールドに対し、データの登録と取得を行って
 * 取得したデータを画面に表示するプログラムを作成してください。
 */
public class Xxx {
	public static void main(String[] args) {
		UserInfo UI=new UserInfo();
		UI.setName("山田源之助");

		System.out.println(UI.getName());

	}
}
