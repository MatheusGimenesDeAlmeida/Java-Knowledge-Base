package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.Map;

public class Frequencia {
    public Map<Character, Integer> conta(String s) {
        // transforma a palavra numa lista de letras
        // Lista é iterada, é criada uma segunda lista com apenas letras únicas
        // é feito um dicionário com essas letras únicas e um valor padrão = 0
        // itera a lista principal, caso uma letra esteja no dicionario, adicionar 1
        Map<Character, Integer> frequencia = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!frequencia.containsKey(c)) { //verifica se a chave representada por c não está presente no mapa frequencia. Se a chave não estiver presente, a condição será verdade
                frequencia.put(c, 0); // Coloca o carctere como chave e o 0 como valor
            }
            frequencia.put(c, frequencia.get(c) + 1); // Se a chave já existir adiciona + 1 no valor da chave que já existe
            // frequência.get(c) serve para pegar o valor da chave c
        }
        return frequencia;
    }
}
