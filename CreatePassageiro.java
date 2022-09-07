import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreatePassageiro extends Passageiro {
    private final Connection status;

    public CreatePassageiro(Connection conn) throws SQLException {
        super(conn);
        this.status = conn;
    }

    public void Create(Scanner in) throws SQLException {

        String sql = "INSERT INTO passageiro (nome,email) VALUES (?,?)";
        PreparedStatement statement = status.prepareStatement(sql);

        in.nextLine();
        System.out.println("Nome de passageiro:");
        super.nome = in.nextLine();
        System.out.println("Email de passageiro:");
        super.email = in.nextLine();

        statement.setString(1, super.nome);
        statement.setString(2, super.email);

    }
}