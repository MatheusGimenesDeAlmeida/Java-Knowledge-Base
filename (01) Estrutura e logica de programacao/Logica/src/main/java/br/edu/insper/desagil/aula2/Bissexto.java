package br.edu.insper.desagil.aula2;

public class Bissexto {
    public boolean decide(int ano) {
        if ((ano % 100 != 0 && ano % 4 == 0) || ano == 2000){
            return true;
        }
        else
            return false;
    }
}
