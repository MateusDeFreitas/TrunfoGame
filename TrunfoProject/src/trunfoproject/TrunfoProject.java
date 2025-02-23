package trunfoproject;

import java.util.Scanner;

public class TrunfoProject 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            Jogador j1 = new Jogador();
            Jogador j2 = new Jogador();
            Batalha obj = new Batalha();
            obj.iniciarBatalha(j1, j2);
            
            System.out.println("Deseja jogar novamente [S/N]?");
            String resposta = scanner.nextLine().toUpperCase();
            
            while (true)
            {
                if (resposta == "N")
                {
                    System.out.println("Jogo encerrado.");
                    break;
                } 
                else if (resposta != "S")
                {
                    System.out.println("Insira um valor válido.");
                }
            }
            if (resposta == "N")
            {
                break;
            } 
        }
    }

    public TrunfoProject()
    {
        
    }
}