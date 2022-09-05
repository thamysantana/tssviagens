package siteviagens;

public class passageiros2 {

}
import java.sql.Connection;
import java.sql.SQLException;

    private final Connection status;

    public passageiros(Connection conn) throws SQLException {
        this.status = conn;
    }

    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String rg;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public String telefone; 

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

}
