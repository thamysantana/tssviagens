
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import java.sql.ResultSet;
import java.sql.Statement;

public class readCliente extends Cliente {
    private final Connection status;

    public readCliente(Connection conn) throws SQLException {
        super(conn);
        this.status = conn;
    }

    public void Read() throws SQLException {

        
        String sql = "SELECT * FROM cliente";

        Statement statement = status.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) {
            this.id = result.getInt(1);
            this.nome = result.getString(2);
            this.senha = result.getString(3);
            this.login = result.getString(3);


            String out = "Cliente #%d: %s - %s - %s";
            System.out.println(String.format(out, this.id, this.nome, this.senha, this.login));
            System.out.println("-----------------------------------");
            // }
        }
    }
}