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
	                System.out.println("2-Clientes");
	                System.out.println("3-Passagens");
	                System.out.println("3-Contato");
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
	                
	                //cliente
	                case 2 -> {
	                    System.out.println("1-Novo Cliente");
	                    System.out.println("2-Ver Clientes");
	                    System.out.println("3-Atualizar Dados");
	                    System.out.println("4-Deletar Cliente");
	                    opt = c.nextInt();

	                    switch (opt) {

	                    case 1 -> {
	                        addCliente C = new addCliente(conn);
	                        C.Create(c);
	                    }

	                    case 2 -> {
	                        readCliente R = new readCliente(conn);
	                        R.Read();
	                    }

	                    case 3 -> {
	                        updateCliente U = new updateCliente(conn);
	                        Boolean nome;
	                        Boolean email;
	                        Boolean telefone;
	                        Boolean senha;
	                        System.out.println("1-Alterar Nome");
	                        System.out.println("2-Alterar Senha");
	                        System.out.println("2-Alterar Email");
	                        System.out.println("2-Alterar Telefone");
	                        opt = c.nextInt();

	                        switch (opt) {

	                        case 1 -> {
	                            nome = true;
	                            senha = false;
	                            telefone = false
	                            email = false
	                            U.Update(c, nome, senha, telefone, email);
	                        }

	                        case 2 -> {
	                            senha = true;
	                            nome = false;
	                            telefone = false;
	                            email = false;
	                            U.Update(c, nome, senha, telefone, email);
	                        }

	                        case 3 -> {
	                            nome = false;
	                            senha = false;
	                            telefone = false;
	                            email = false;
	                            U.Update(c, nome, senha, telefone, email);
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
	                    opt = c.nextInt();

	                    //Destino
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
	                        updateDestinoU = new updateDestino(conn);
	                        System.out.println("1-Alterar Nome de Destino");
	                        System.out.println("2-Alterar Horario Embarque");
	                        System.out.println("2-Alterar Horario Partida");
	                        opt = in.nextInt();

	                        if (opt == 1) {
	                            nome_Destino = true;
	                            horaEmbarque = false;
	                            horaRetorno = false;
	                            U.Update(in, nome_Destino, horaEmbarque, horaRetorno);
	                        } else if (opt == 2) {
	                        	nome_Destino = false;
	                            horaEmbarque = true;
	                            horaRetorno = false;
	                            U.Update(in, nome, email, telefone);
	                        }
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

	                default -> System.out.println("Escolha uma das opcoes validas");
	                }
	            }
		 }

	         catch (SQLException ex) {
	            ex.printStackTrace();
	         
	        }
        
	}
			
	

	
}