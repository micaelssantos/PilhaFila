package ed_atividade01;
import java.util.Scanner;
/**
 *
 * @author Micael Santos
 */
public class Ex1 {

    /**
     * Exercício 1 Escreva um método que recebe uma string e imprime seus
     * caracteres em ordem inversa, usando uma pilha. Esse exercício foi
     * resolvido uma vez em sala de aula, mas é legal que você tente fazer
     * primeiro sem olhar a resolução. esse método não é uma operação da Pilha,
     * mas sim um método da classe Main que utilizará a Pilha
     */
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma Frase que será invertida: ");
        String frase = leitor.nextLine();
        System.out.print("Sua frase invertida fica da seguinte forma: ");
        imprimeInvertido(frase);
    }

    static void imprimeInvertido(String frase) {
        Pilha p = new Pilha(frase.length());
        for (int i = 0; i < frase.length(); i++) {
            p.insere(frase.charAt(i));
        }
        while (p.tamanho() > 0) {
            System.out.print(p.remove());
        }
        System.out.println();
    }
}
