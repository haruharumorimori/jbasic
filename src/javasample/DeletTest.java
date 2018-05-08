package javasample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletTest {
	public static void main(String[] args) {
		try {
			//jdbcドライバの登録
			Class.forName("com.mysql.cj.jdbc.Driver");
			//url,ユーザー名,パスワードの設定
			String url="jdbc:mysql://localhost/sample?serverTimezone=UTC&useSSL=false";
			String user="student";
			String pass="himitu";
			//データベースへの接続
			Connection con=DriverManager.getConnection(url,user,pass);
			//SQL文作成
			String sql="DELETE from emp where code=4 ";
			//PreparedStatementオブジェクトの取得
			PreparedStatement st=con.prepareStatement(sql);
			//SQL実行
			int rows=st.executeUpdate();
			System.out.println(rows+"件データ削除");
			//接続の解放
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
