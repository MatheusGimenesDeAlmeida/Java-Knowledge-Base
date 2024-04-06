package br.edu.insper.desagil.aula3;

import java.util.List;

public class Audio {
    public void clip(List<Integer> onda, int limite) {
        for (int i = 0; i < onda.size(); i++) {
            int valor = onda.get(i); // Seria o equivalente a valor[i]
            if (valor < -limite) {
                onda.set(i, -limite);
            } else if (valor > limite) {
                onda.set(i, limite);
            }
        }
    }
}

/* length: É usado para obter o tamanho de arrays em Java. Arrays são coleções de tamanho fixo, onde cada elemento pode ser acessado por um índice.
Uma vez que um array é criado, seu tamanho não pode ser alterado. Para obter o tamanho de um array, você usa a propriedade length (sem parênteses), como em meuArray.length.

size(): É um método usado para coleções na Java Collections Framework, como ArrayList, LinkedList, HashSet, e assim por diante.
Diferentemente dos arrays, as coleções têm tamanhos dinâmicos, o que significa que itens podem ser adicionados ou removidos, e o tamanho da coleção pode mudar.
 Para obter o número de elementos atualmente armazenados em uma coleção, você usa o método size(), como em minhaColecao.size().


Nas listas, o método set(int index, E element) é usado para substituir o elemento em uma posição específica na lista pelo elemento fornecido.
Após a chamada deste método, a lista terá o novo elemento na posição especificada, e o método retorna o elemento que estava anteriormente nessa posição.
Isso permite alterar o valor de itens específicos em uma lista.

Parâmetros:

index: O índice do elemento a ser substituído.
element: O elemento a ser armazenado na posição especificada.
Retorno: O método retorna o elemento anteriormente na posição especificada.



        */