package com.company;

import java.sql.SQLOutput;

public class Quadrilatero {

    public void area(int lado){
        int area = lado * lado;
        System.out.println("A area do quadrado é: " + area);
    }

    public void area(int base, int altura){
        int area = base * altura;
        System.out.println("A area do retângulo é: " + area);
    }

    public void area(double baseMenor, double baseMaior, double altura){
        double area = ((baseMenor+baseMaior)*altura)/2;
        System.out.println("A area do trapézio é: " + area);
    }
}
