import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class readDestino extends Destino {
    private final Connection status;

    public readDestino(Connection conn) throws SQLException {
        super(conn);
        this.status = conn;
    }

    public void Read(Scanner in) throws SQLException {

            String sql = "SELECT * FROM destino";

            Statement statement = status.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                this.id = result.getInt(1);
                this.dataViagem = result.getDate(2);
                this.horaPartida = result.getTime(3);
                this.origem = result.getString(4);
                this.destino = result.getString(5);

                String out = "Destino #%d: %s - %s - %s | %d - %d - %d - %s";
                System.out.println(String.format(out, this.id, this.dataViagem, this.horaPartida, this.origem, this.destino);
                System.out.println("---------------------------------------------");
        }
    }
}