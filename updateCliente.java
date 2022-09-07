
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateCliente extends Cliente {

    private final Connection status;

   
    public updateCliente(Connection conn) throws SQLException {
        super(conn);
        this.status = conn;
    }

    public void Update(Scanner in, Boolean set_nome, Boolean set_senha, Boolean set_ativo) throws SQLException {
        if (set_nome == true) {
            String sql = "UPDATE cliente set nome = ? where id = ?";
            PreparedStatement statement = status.prepareStatement(sql);

            in.nextLine();
            System.out.println("Novo Nome:");
            super.nome = in.nextLine();
            System.out.println("Para a id:");
            this.id = in.nextInt();

            statement.setString(1, super.nome);
            statement.setInt(2, this.id);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Nome Alterado");
            }
        }
        if (set_senha == true) {
            String sql = "UPDATE cliente set senha = ? where id = ?";
            PreparedStatement statement = status.prepareStatement(sql);

            in.nextLine();
            System.out.println("Nova Senha:");
            super.senha = in.nextLine();
            System.out.println("Para a id:");
            this.id = in.nextInt();

            statement.setString(1, sql);
            statement.setInt(2, this.id);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Senha alterada");
            }
        }
        // desativar usuario
        if (set_ativo == true) {
            String sql = "UPDATE cliente set ativo = ? where id = ?";
            PreparedStatement statement = status.prepareStatement(sql);

            System.out.println("ativar = true, desativar = false");
            super.ativo = in.nextBoolean();
            System.out.println("Para a id:");
            this.id = in.nextInt();

            statement.setBoolean(1, super.ativo);
            statement.setInt(2, this.id);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Estado alterado");
            }
        }

    }

}