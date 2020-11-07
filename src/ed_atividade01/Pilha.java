package ed_atividade01;

/**
 *
 * @author Micael Santos
 */
public class Pilha {

    private int topo;
    private char[] pilha;
    
    
    public Pilha(int capacidade) {
        topo = -1;
        pilha = new char[capacidade];
    }

    public void insere(char novo) {
        try {
            topo++;
            pilha[topo] = novo;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Tentou inserir na pilha lotada!");
        }
    }

    // Exercício: envolver o return em um try/catch igual
    // ao do método remove
    public char topo() {
        try {
            return pilha[topo];
        } catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("O Topo está vazio!");
        }

    }

    public char remove() {
        try {
            char removido = pilha[topo];
            topo--;
            return removido;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Tentou remover da pilha vazia!");
        }
    }

    public void multipop(int N) {
        if (tamanho() >= N) {
            for (int i = 1; i < N; i++) {
                topo--;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("A Pilha possui menos elementos que o Informado!");
        }
    }

    public int tamanho() {
        return topo + 1;
    }

    public void removeTudo() {
        /*  essa solução é de "tempo constante": não importa
            o tamanho da pilha, sempre executará aproximadamente
            no mesmo tempo.
            
            posso dizer ainda que é um único passo -> O(1)
        */
        this.topo = -1;
        /*  a soluçãoo abaixo é de "tempo linear": quanto mais
            elementos existem na pilha, mais vai demorar
            (e em proporção direta):
                se tem 10 elementos, são 10 passos do while
                se tem 3000 elementos, são 3000 passos.
        
            Dizemos que o número de passos é N, em que N é
            o tamanho da estrutura. --> O(N)
        */
//        while (this.tamanho() > 0) {
//            this.remove();
//        }
    }
}
