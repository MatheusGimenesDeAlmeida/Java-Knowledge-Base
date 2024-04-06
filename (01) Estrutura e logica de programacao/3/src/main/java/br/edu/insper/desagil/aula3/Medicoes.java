package br.edu.insper.desagil.aula3;

import java.util.Map;

public class Medicoes {
    public void normaliza(Map<Integer, Double> medicoes) {
        double total = 0;
        for (double valor : medicoes.values()) {
            total += valor;
        }
        for (int chave : medicoes.keySet()) {  // key.Set serve para retornar um conjunto (Set) contendo todas as chaves presentes no mapa.
            // qualquer alteração feita no conjunto reflete diretamente no mapa original, e vice-versa.
            medicoes.put(chave, medicoes.get(chave) / total); // medições.get(chave) = medições(chave)
        }
    }
}
