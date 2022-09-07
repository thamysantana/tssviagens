import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbc {
    public static void main(String[] args) {
        // Conexao com o banco
        String dbURL = "jdbc:mariadb://localhost:3306/java";
        String username = "thame";
        String passwd = "thame";
        int opt = 999;

        try {
            while (opt != 0) {
                Scanner in = new Scanner(System.in);
                Connection conn = DriverManager.getConnection(dbURL, username, passwd);
                System.out.println("Alteracao para::");
                System.out.println("1-Destinos");
                System.out.println("2-Clientes");
                System.out.println("3-Passageiro");
                System.out.println("3-Veiculos");
                System.out.println("0-sair");
                opt = in.nextInt();
                switch (opt) {
                case 1 -> {
                    System.out.println("1-Novo Destino");
                    System.out.println("2-Ver Destinos");
                    System.out.println("3-Atualizar Destino");
                    System.out.println("4-Deletar Destino");
                    opt = in.nextInt();
                    switch (opt) {
                    case 1 -> {
                        addDestino C = new addDestino(conn);
                        C.Create(in);
                    }
                    case 2 -> {
                        readDestino R = new readDestino(conn);
                        R.Read();
                    }
                    case 3 -> {
                        updateDestino U = new updateDestino(conn);
                        U.Update(in);
                    }
                    case 4 -> {
                        deleteDestino D = new deleteDestino(conn);
                        D.Delete(in);
                    }
                    default -> {
                        System.out.println("Informe uma opcao valida");
                    }
                    }
                }
                case 2 -> {
                    System.out.println("1-Novo Cliente");
                    System.out.println("2-Ver Clientes");
                    System.out.println("3-Atualizar Dados");
                    System.out.println("4-Deletar Cliente");
                    opt = in.nextInt();

                    switch (opt) {

                    case 1 -> {
                        addCliente C = new addCliente(conn);
                        C.Create(in);
                    }

                    case 2 -> {
                        readCliente R = new readCliente(conn);
                        R.Read();
                    }

                    case 3 -> {
                        updateCliente U = new updateCliente(conn);
                        Boolean nome;
                        Boolean senha;
                        Boolean login;
                        System.out.println("1-Alterar Nome");
                        System.out.println("2-Alterar Senha");
                        System.out.println("2-Alterar Email");
                        opt = in.nextInt();

                        switch (opt) {

                        case 1 -> {
                            nome = true;
                            senha = false;
                            login = false;
                            U.Update(in, nome, senha, login);
                        }

                        case 2 -> {
                            senha = true;
                            nome = false;
                            login = false;
                            U.Update(in, nome, senha, login);
                        }

                        case 3 -> {
                            nome = false;
                            senha = false;
                            login = true;
                            U.Update(in, nome, senha, login);
                        }

                        default -> {
                            System.out.println("Informe uma opcao valida");
                        }
                        }
                    }

                    case 4 -> {
                        deleteCliente D = new deleteCliente(conn);
                        D.Delete(in);
                    }

                    default -> {
                        System.out.println("Informe uma opcao valida");
                    }
                    }
                }

                case 3 -> {
                    System.out.println("1-Novo contato");
                    System.out.println("2-Ver contatos");
                    System.out.println("3-Atualizar Dados");
                    System.out.println("4-Deletar contato");
                    opt = in.nextInt();

                    switch (opt) {
                    case 1 -> {
                        addPassageiro C = new addPassageiro(conn);
                        C.Create(in);
                    }

                    case 2 -> {
                        readContato R = new readPassageiro(conn);
                        R.Read();
                    }

                    case 3 -> {
                        updatePassageiro U = new updatePassageiro(conn);
                        Boolean nome;
                        Boolean email;
                        Boolean telefone;
                        System.out.println("1-Alterar Nome");
                        System.out.println("2-Alterar Email");
                        System.out.println("2-Alterar Telefone");
                        opt = in.nextInt();

                        if (opt == 1) {
                            nome = true;
                            email = false;
                            telefone = false;
                            U.Update(in, nome, email, telefone);
                        } else if (opt == 2) {
                            nome = false;
                            email = true;
                            telefone = false;
                            U.Update(in, nome, email, telefone);
                        }
                    }

                    case 4 -> {
                        deletePassageiro D = new deletePassageiro(conn);
                        D.Delete(in);
                    }

                    default -> {
                        System.out.println("Informe uma opcao valida");
                    }
                    }
                }

                default -> System.out.println("Escolha uma das opcoes validas");
                }
            }

         catch (SQLException ex) {
            ex.printStackTrace();
         
        }

    }
