package ed_atividade01;
/**
 *
 * @author Micael Santos
 */
public class Ex2 {
    
    /**
     * Exercício 2 Escreva na classe Pilha um método "removeVarios" (também
     * conhecido como a operação "multipop", isto é, vários pops de uma vez).
     * Esse método recebe um inteiro N que indica a quantidade de itens a serem
     * removidos. Se a pilha tiver menos de N elementos, você pode escolher um
     * dos seguintes comportamentos 
     * Lançar um erro e encerrar o programa 
     * Remover todos os elementos da pilha, sem lançar erro 
     * 
     * No primeiro caso, seu método pode ser void (isto é, não retornar nada). 
     * No segundo caso, retorne a quantidade de elementos removidos.
     */
    
    public static void main(String[] args) {
        Pilha P = new Pilha(5); 
        P.insere('A');
        P.insere('B');
        P.insere('C');
        
        P.multipop(4);
    }
     
}
