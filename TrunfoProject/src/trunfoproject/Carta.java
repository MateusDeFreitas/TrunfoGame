package trunfoproject;

import java.util.Random;

public class Carta 
{
    int forca;
    int inteligencia;
    int defesa;
    int fadiga;

    public Carta() 
    {
        Random nr_aleatorio = new Random();
        
        forca = nr_aleatorio.nextInt(100);
        inteligencia = nr_aleatorio.nextInt(100);
        defesa = nr_aleatorio.nextInt(100);
        fadiga = nr_aleatorio.nextInt(100);
    }
    
    void exibirCarta()
    {
        System.out.println("\n--------Carta--------\n ");
        System.out.println("Força        : " +forca);
        System.out.println("Inteligencia : " +inteligencia);
        System.out.println("Defesa       : " +defesa);
        System.out.println("Fadiga       : " +fadiga);
        System.out.println("----------------------\n");
    }
}