package siteviagens;

public class Viagens3 {

	}

	import java.sql.Connection;
	import java.sql.SQLException;

	private final Connection status;

	public Viagens3(Connection conn) throws SQLException {
        this.status = conn;
    }

	public int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String dataViagens;

	public String getDataViagens() {
		return dataViagens;
	}

	public void setDataViagens(String dataViagens) {
		this.dataViagens = dataViagens;
	}

	public String horaPartida;

	public String getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}

	public String origem;

	public String origem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String destino;

	public String getDestino {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

}
