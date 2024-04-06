package br.edu.insper.desagil.aula2;

public class Tabuada {
    public String constroi(int n) {
        String resposta = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                resposta += (i * j) + " ";
            }
            resposta += "\n";
        }
        return resposta;
    }
}
