import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class createdestino extends Destino {

    private final Connection status;

    public createDestino(Connection conn) throws SQLException {
        super(conn);
        this.status = conn;
    }

    public void Create(Scanner in) throws SQLException {

        String sql = "INSERT INTO destino (dataviagens,horaPartida, origem, destino) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement statement = status.prepareStatement(sql);

        in.nextLine();
        System.out.println("Para onde você vai?");
        super.nome = in.nextLine();
        System.out.println("De onde você esta saindo?");
        super.preco = in.nextInt();
        System.out.println("Data da viagem: ");
        super.desconto = in.nextDate();
        System.out.println("Horario da partida:");
        super.duracao = in.nextTime();


        statement.setDate(1, this.dataViagem);
        statement.setTime(2, this.horaPartida);
        statement.setString(3, this.origem);
        statement.setString(4, this.destino);

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("Novo destino");
        }

    }
}