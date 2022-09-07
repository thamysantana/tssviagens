import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import java.sql.ResultSet;
import java.sql.Statement;

public class readPassageiro extends passageiro{
	private final Connection status;

	public readPassageiro(Connection conn) throws SQLException {
		super(conn);
		this.status = conn;
	}

	public void Read() throws SQLException {
			String sql = "SELECT * FROM passageiro";

			Statement statement = status.createStatement();
			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				this.id = result.getInt(1);
				this.nome = result.getString(2);
				this.email = result.getString(3);

				String out = "passageiro #%d: %s - %s";
				System.out.println(String.format(out, this.id, this.nome, this.email));
				System.out.println("-----------------------------------");
		}
	}
}