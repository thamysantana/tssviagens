package br.com.connectiontssviagens;

import java.sql.Connection;
import java.util.Date;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conntssviagens {

	public static void main(String[] args) {
	}
		Connection conn = null;
		public static final String URL = "jdbc:mariadb://localhost:3306/tssviagens";
		public static final String username = "root";
		public static final String password = "thame";
		{
		
		 try {
	            while (opt != 0) {
	            	Connection conn = null; 
	                Scanner c = new Scanner(System.in);
	                Connection conn = DriverManager.getConnection(URL, username, passwordd);
	                
	                System.out.println("Alterar:");
	                System.out.println("1-Destinos");
	                System.out.println("2-Clientes")
	                System.out.println("3-Contato");
			System.out.println("3-Usuario");

	                System.out.println("0-sair");
	                opt = c.nextInt();
	                
	                //Destino
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
	                        C.Create(c);
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
	                
	                //Contato
	                case 2 -> {
	                    System.out.println("1-Novo Contato");
	                    System.out.println("2-Ver Contatos");
	                    System.out.println("3-Atualizar Dados");
	                    System.out.println("4-Deletar Contato");
	                    opt = c.nextInt();

	                    switch (opt) {

	                    case 1 -> {
	                        addContato C = new addContato(conn);
	                        C.Create(c);
	                    }

	                    case 2 -> {
	                        readContato R = new readContato(conn);
	                        R.Read();
	                    }

	                    case 3 -> {
	                        updateContato U = new updateContato(conn);
	                        Boolean nome;
	                        Boolean email;
	                        Boolean telefone;
	                        System.out.println("1-Alterar Nome");
	                        System.out.println("2-Alterar Email");
	                        System.out.println("2-Alterar Telefone");
	                        opt = c.nextInt();

	                        switch (opt) {

	                        case 1 -> {
	                            nome = true;
	                            telefone = false;
	                            email = false;
	                            U.Update(c, nome, telefone, email);
	                        }

	                        case 2 -> {
	                            
	                            nome = false;
	                            telefone = false;
	                            email = false;
	                            U.Update(c, nome, telefone, email);
	                        }

	                        case 3 -> {
	                            nome = false;
	                            telefone = false;
	                            email = false;
	                            U.Update(c, nome, telefone, email);
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
	                //Usuario
	                case 2 -> {
	                    System.out.println("1-Novo Usuario");
	                    System.out.println("2-Ver Usuarios");
	                    System.out.println("3-Atualizar Dados");
	                    System.out.println("4-Deletar Usuario");
	                    opt = c.nextInt();

	                    switch (opt) {

	                    case 1 -> {
	                        addUsuario C = new addUsuario(conn);
	                        C.Create(c);
	                    }

	                    case 2 -> {
	                        readUsuario R = new readUsuario(conn);
	                        R.Read();
	                    }

	                    case 3 -> {
	                        updateUsuario U = new updateUsuario(conn);
	                        Boolean nome;
	                        Boolean email;
	                        Boolean telefone;
	                        Boolean Senha;
	                        System.out.println("1-Alterar Nome");
	                        System.out.println("2-Alterar Email");
	                        System.out.println("2-Alterar Senha");
	                        System.out.println("2-Alterar Telefone");

	                        opt = c.nextInt();

	                        switch (opt) {

	                        case 1 -> {
	                            nome = true;
	                            telefone = false;
	                            email = false;
	                            senha = false;
	                            U.Update(c, nome, telefone, email, senha);
	                        }

	                        case 2 -> {
	                            
	                            nome = false;
	                            telefone = false;
	                            email = false;
	                            senha = false;
	                            U.Update(c, nome, telefone, email, senha);
	                        }

	                        case 3 -> {
	                            nome = false;
	                            telefone = false;
	                            email = false;
	                            senha = false;
	                            U.Update(c, nome, telefone, email, senha);
	                        }

	                        default -> {
	                            System.out.println("Informe uma opcao valida");
	                            {
	                            	
	                            }
	                        }

	         catch (SQLException ex) {
	            ex.printStackTrace();
	         
	        }
        
	}
			
	

	
}
