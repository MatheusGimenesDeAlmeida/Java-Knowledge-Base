package br.edu.insper.desagil.aula2;

public class Inversa {
    public String constroi(String s) {
        String nova = "";
        int l = s.length();

        while (l > 0){
            char c = s.charAt(l-1);
            nova += c;
            l -= 1;
        }
        return nova;

    }
}
