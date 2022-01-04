package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculadora:");
        Calculadora calculadora = new Calculadora(8,7);

        System.out.println("____________________________________");
        System.out.println("Mensagem");
        Mensagem mensagem = new Mensagem();
        mensagem.saudacao(9);
        mensagem.saudacao(15);
        mensagem.saudacao(18);

        System.out.println("____________________________________");
        System.out.println("Empréstimo");
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.solicitarEmprestimo(10000 , 10 );
        emprestimo.solicitarEmprestimo(10000 , 12 );
        emprestimo.solicitarEmprestimo(10000 , 5 );

    }


}
