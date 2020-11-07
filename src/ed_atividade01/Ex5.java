package ed_atividade01;

import java.util.Scanner;

/**
 *
 * @author Micael Santos
 */
public class Ex5 {
    /**
    * Escreva um programa, usando Fila, que possa simular por inputs do teclado
    * um sistema de atendimento.
    * Seu programa terá que ler três tipos de comando diferente, cada um
    * codificado por uma única letra: "C", "A" e "F".
    * O comando C indica a chegada de um cliente. Ao ler esse comando, seu
    * programa deve gerar uma senha e inseri-la na fila, imprimindo uma mensagem
    * do tipo:
    * "GERADA SENHA 2. AGUARDE ATENDIMENTO"
    * O comando A indica que um atendente está pronto para receber alguém no
    * balcão. O seu programa deverá remover uma senha da fila e imprimir uma
    * mensagem do tipo:
    * "CHAMANDO SENHA 2."
    * O comando F significa fim de expediente.
    * Ao ler F, seu programa deverá imprimir um relatório contendo:
    * - O número de clientes que chegaram
    * - O número de clientes que ficaram sem atendimento
    * E em seguida encerrar.
    * Exemplo de execução, onde alternamos entre leituras de prints:
    * C
    * "GERADA SENHA 1, AGUARDE ATENDIMENTO"
    * C
    * "GERADA SENHA 2, AGUARDE ATENDIMENTO"
    * C
    * "GERADA SENHA 3, AGUARDE ATENDIMENTO"
    * A
    * "CHAMANDO SENHA 1"
    * A
    * "CHAMANDO SENHA 2"
    * C 
    * "GERADA SENHA 4, AGUARDE ATENDIMENTO"
    * F
    * "CHEGARAM 4 CLIENTES.
    * O EXPEDIENTE ACABOU COM 2 CLIENTES AINDA NA FILA."
    */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Fila F = new Fila(10);
        
        int senha = 0;
        
        String opcao;
        
        do{
            opcao = Menu();
            
        switch(opcao){
            case "C" :
                senha++;
                F.insere(senha);
                System.out.println("Gerada a senha: " + senha + ", aguarde o atendimento.");
                break;
            case "A" :
                System.out.println("Chamando a senha: " + F.remove());
                break;
            case "F" :
                System.out.println("Chegaram "+ F.getTamanhoTotal() + " clientes");
                System.out.println("O Expediente acabou com " + F.tamanho() + " cliente(s) na fila.");
                break;
        }
        } while(!opcao.equals("F"));
    }
    
    public static String Menu(){
        Scanner input = new Scanner(System.in);
        String escolha;

        System.out.println("\t\tMenu"
                + "\n\nC) Chegada de um cliente"
                + "\nA) Receber cliente"
                + "\nF) Fim do Expediente");

        System.out.print("\nEscolha: ");
        escolha = input.next().toUpperCase().trim();

        while (!(escolha.equals("A") || escolha.equals("C") || escolha.equals("F"))) {
            System.out.print("\nEscolha um opção válida: ");
            escolha = input.next().toUpperCase().trim();
        }
        return escolha;
    } 
}
