package com.company;

public class Emprestimo {
    public void solicitarEmprestimo(double valor, double parcelas){
        double valorFinal = valor + valor * juros(parcelas);
        double valorParcelas = valorFinal/parcelas;
        System.out.println();
        System.out.println("Valor do empréstimo: R$" + valor + " | Quantidade de parcelas: "  + parcelas);
        System.out.println("valor final para " + parcelas + " parcelas é igual a: R$" + valorFinal);
        System.out.println("O empréstimo será pago através de " + parcelas + " parcelas de R$" + valorParcelas );
    }
    private double juros(double parcelas){
        return (parcelas*0.01);
    }
}
