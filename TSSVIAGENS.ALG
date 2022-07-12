Algoritmo "TSSviagens"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/07/2022
Var
   nomeCliente, destino, tel, email : vetor [1..3] de caractere
    op, cliente: caractere
    i:inteiro

Inicio
   escreval ("-----------------------------------")
  escreval (" ")
   escreval ("-------------- TSS Viagens --------------")
   escreval (" ")
   escreval ("-----------------------------------")
   escreval (" ")

   escreval (" ")
   escreval ("------------- Cadastro De Cliente ------------")
   escreval (" ")
   
    para i de 1 ate 3 faca

      escreva ("Digite o Nome: ")
      leia (nomeCliente[i])
      escreva ("Digite o E-mail: ")
      leia (email[i])
      escreva ("Digite o Telefone: ")
      leia (tel[i])
      escreva ("Digite o Destino: ")
      leia (destino[i])
      escreval ("")

   fimpara
   escreval ("")
   escreval ("-------------- Buscar Cadastros --------------")
   escreval ("")


   escreval ("Deseja Acessar o Cadastro dos Clientes?")
   leia (op)


   se (op = "sim")entao
      escreval ("Digite o Nome do Cliente: ")
      leia (cliente)
   senao
      escreval (" ")
      escreval (" Saindo.....")
   fimse

   para i de 1 ate 3 faca

      se (cliente = nomeCliente[i])entao
         escreval (" ")
         escreval ("NOME: ", nomeCliente[i])
         escreval ("E-MAIL: ", email[i])
         escreval ("TELEFONE: ", tel[i])
         escreval ("DESTINO FAVORITO: ", destino[i])
      fimse

   fimpara
   
   
   
   
Fimalgoritmo