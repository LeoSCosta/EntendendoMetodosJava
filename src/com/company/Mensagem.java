package com.company;

public class Mensagem {
    public void saudacao(int hora){
        switch (hora){
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("bom dia! Agora são: " + hora + "Horas");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("boa tarde! Agora são: " + hora + "Horas");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Boa noite! Agora são: " + hora + "Horas");
                break;
            default:
                System.out.println("hora invalida");
                break;

        }
    }
}
