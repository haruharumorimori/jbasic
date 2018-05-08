package javasample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SlectTest2 {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("年齢を入力してください。");
			System.exit(1);
		}
		try {
			//jdbcドライバの登録
			Class.forName("com.mysql.cj.jdbc.Driver");
			//URL、ユーザー、パスワードの設定
			String url="jdbc:mysql://localhost/sample?serverTimezone=UTC&useSSL=false";
			String user="student";
			String pass="himitu";
			//データベースの接続
			Connection con=DriverManager.getConnection(url,user,pass);
			//sql文作成
			String sql="SELECT*FROM emp where age>=?";
			//PreparedStatementの取得
			PreparedStatement st=con.prepareStatement(sql);
			//プレースホルダーの設定
			int age=Integer.parseInt(args[0]);
			st.setInt(1, age);
			//SQLの実行
			ResultSet rs=st.executeQuery();
			//結果の取得及び表示
			while(rs.next()) {
				System.out.print(rs.getInt("code")+":");
				System.out.print(rs.getString("name")+":");
				System.out.print(rs.getInt("age")+":");
				System.out.println(rs.getString("tel")+":");
			}
			//リソースの解放
			rs.close();
			st.close();
			con.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
