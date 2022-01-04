package com.company;

public class Calculadora {

    public Calculadora(double a, double b){
        int soma = soma((int)a, (int)b);
        int subtracao = subtracao((int)a, (int)b);
        int multiplicacao = multiplicacao((int)a, (int)b);
        double divisao = divisao(a,b);

        System.out.println("A soma dos dos dois numero é igual a: " + soma);
        System.out.println("A subtração dos dos dois numero é igual a: " + subtracao);
        System.out.println("A divisão dos dos dois numero é igual a: " + divisao);
        System.out.println("A multiplicação dos dos dois numero é igual a: " + multiplicacao);
    }

    public int soma(int a, int b){
        return (a + b);
    }
    public int subtracao(int a, int b){
        return (a - b);
    }
    public int multiplicacao(int a, int b){
        return (a * b);
    }
    public double divisao(double a, double b){
        return (a / b);
    }

}
