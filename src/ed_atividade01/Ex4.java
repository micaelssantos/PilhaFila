package ed_atividade01;
/**
 *
 * @author Micael Santos
 */
public class Ex4 {
    
    /**
    * Modifique a classe Fila para adicionar um atributo inteiro chamado
    * "total_elementos" (ou nome similar à sua escolha). 
    * Esse atributo deveguardar a quantidade de elementos que já passaram 
    * pela fila desde sua criação.
    * Exemplo:
    * Cria fila
    * insere 42
    * insere 68
    * remove
    * insere 35
    * Após essas operações, o número de elementos (tamanho) da fila é 2, porém
    * o total "histórico" é 3.
    * Esse atributo é privado, mas deve ter um método "getter" (um método público
    * que retorna seu valor).
    */
    
    public static void main(String[] args) {
        Fila F = new Fila(5);
        
        F.insere(42);
        F.insere(68);
        F.remove();
        F.insere(35);
        
        System.out.println("A quantidade total de elementos que já passaram pela"
                + " estutura é: " + F.getTamanhoTotal());
    }
}
