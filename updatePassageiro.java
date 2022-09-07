import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updatePassageiro extends Contato {
    private final Connection status;

    public updatePassageiro(Connection conn) throws SQLException {
        super(conn);
        this.status = conn;
    }

    public void Update(Scanner in, Boolean set_nome, Boolean set_email) throws SQLException {
        if (set_email == true) {
            String sql = "UPDATE passageiro set email = ? where id = ?";
            PreparedStatement statement = status.prepareStatement(sql);

            in.nextLine();
            System.out.println("Novo email:");
            super.email = in.nextLine();
            System.out.println("Para id");
            this.id = in.nextInt();

            statement.setString(1, super.email);
            statement.setInt(2, this.id);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Email alterado");
            }
        } else if (set_nome == true) {
            String sql = "UPDATE passageiro set nome = ? where id = ?";
            PreparedStatement statement = status.prepareStatement(sql);

            in.nextLine();
            System.out.println("Novo Nome:");
            super.nome = in.nextLine();
            System.out.println("Para id");
            this.id = in.nextInt();

            statement.setString(1, super.nome);
            statement.setInt(2, this.id);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Nome alterado");
            }
        } else {
            System.out.println("Informar um nome ou email:");
        }
    }
}