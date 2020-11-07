package ed_atividade01;

import java.util.Scanner;

/**
 *
 * @author Micael Santos
 */
public class Ex3 {

    /**
     * Escreva um método que recebe uma String consistindo numa sequência de
     * parênteses, como as seguintes: 1. "()(())" 2. "((())())" 3. "()(" 4.
     * "()()()" 5. "))()((" 6. "(()(" Chamamos uma sequência de parênteses de
     * "bem-formada" se todos os parênteses que são abertos acabam sendo
     * corretamente fechados, e se além disso nenhum parênteses é fechado antes
     * de abrir. Nos exemplos acima, as expressões 1, 2 e 4 são bem-formadas. As
     * expressões 3, 5 e 6 são mal formadas. Seu método deverá retornar true, se
     * a expressão recebida é bem formada, e false caso contrário. Isso pode ser
     * feito usando uma pilha! A dica para a resolução é a seguinte: percorra a
     * expressão caractere por caractere. Sempre que encontrar um "(", insira na
     * pilha. Quando encontrar um ")", ele fecha o parênteses no topo da pilha!
     * Assim, ao ler um ")", você deve desempilhar o "(" do topo. O que acontece
     * se chega um ")" e a pilha está vazia? O que acontece se ao final da
     * expressão a pilha estiver com alguns "(" que não forem removidos?
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira a sequênica: ");
        String sequencia = leitor.nextLine();

        if (bemFormado(sequencia)) {
            System.out.println("Sua Expressão é Bem formada!");
        } else {
            System.out.println("Sua Expressão é Mal formada!");
        };
    }

    static boolean bemFormado(String expressao) {
        Pilha p = new Pilha(expressao.length());
        char caracter;
        for (int i = 0; i < expressao.length(); i++) {

            caracter = expressao.charAt(i);

            if (caracter == ')' && p.tamanho() == 0) {
                return false;
            }
            if (caracter == '(') {
                p.insere(caracter);
            }
            if (caracter == ')') {
                p.remove();
            }
            if (i == expressao.length() - 1 && p.tamanho() > 0) {
                return false;
            }
        }
        return true;
    }
}
