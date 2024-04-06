package br.edu.insper.desagil.aula2;

public class Calculadora {
    public double executa(int a, int b, char op) {
        if (op == '+'){
            return a + b;
        }
        if (op == '-'){
            return a - b;
        }
        if (op == '*'){
            return a * b;
        }
        if (op == '/' && b != 0){
            return (double) a/b;
        }
        else
            return 0.0;
    }
}
