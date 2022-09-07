import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class creatCliente extends Cliente {
    private final Connection status;

    public creatCliente(Connection conn) throws SQLException {
        super(conn);
        this.status = conn;
    }

    public void Create(Scanner in) throws SQLException {
        String sql = "INSERT INTO cliente (nome,senha,ativo) VALUES (?,?,?)";
        PreparedStatement statement = status.prepareStatement(sql);

        in.nextLine();
        System.out.println("Nome do cliente:");
        super.nome = in.nextLine();
        System.out.println("Senha do cliente:");
        super.senha = in.nextLine();
        super.ativo = true;

        statement.setString(1, this.nome);
        statement.setString(2, this.senha);
        statement.setBoolean(3, this.ativo);

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("Novo Cliente");
        }
    }
}