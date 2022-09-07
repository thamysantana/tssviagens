import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePassageiro extends passageiro {
	private final Connection status;

	public DeletePassageiro(Connection conn) throws SQLException {
		super(conn);
		this.status = conn;
	}

	public void Delete(Scanner in) throws SQLException {
		final String sql = "DELETE FROM passageiro where id = ?";

		final PreparedStatement statement = status.prepareStatement(sql);
		System.out.println("Deletar id:");
		this.id = in.nextInt();
		statement.setInt(1, this.id);

		final int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
			System.out.println("Passageiro apagado, viagem cancelada.");
		}
	}
}
