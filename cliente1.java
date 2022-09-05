package siteviagens;

public class cliente1 {

}

import java.sql.Connection;
import java.sql.SQLException;

    private final Connection status;

    public cliente(Connection conn) throws SQLException {
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

    public String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    

}
