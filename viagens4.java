package siteviagens;

public class viagens4 {

}
import java.sql.Connection;
import java.sql.SQLException;

    private final Connection status;

    public Veiculos(Connection conn) throws SQLException {
        this.status = conn;
    }
    public int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String CompanhiaAerea;

	public String getCompanhiaAerea() {
		return CompanhiaAerea;
	}

	public void setCompanhiaAerea(String CompanhiaAerea) {
		this.CompanhiaAerea = CompanhiaAerea;
	}

	public String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	

}
