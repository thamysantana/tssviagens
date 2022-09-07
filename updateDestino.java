import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateDestino extends Destino {
    private final Connection status;
    private int change;

    public updateDestino(Connection conn) throws SQLException {
        super(conn);
        this.status = conn;
    }

    public void Update(Scanner in) throws SQLException {
        String sql = "UPDATE destino set preco = ?, desconto = ?, duracao = ? where id = ?";

        PreparedStatement statement = status.prepareStatement(sql);

        in.nextLine();
        System.out.println("Novo Destino?");
        super.preco = in.nextString();
        System.out.println("Novo horario");
        super.desconto = in.nextTime();
        System.out.println("Nova Data");
        super.duracao = in.nextString();


        statement.setInt(1, this.destino);
        statement.setInt(2, this.dataViagem);
        statement.setString(3, super.horaPartida);

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("Destino alterado");
        }
    }
}