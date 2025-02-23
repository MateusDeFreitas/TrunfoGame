package trunfoproject;

import java.util.Random;
import java.util.Scanner;

public class Batalha 
{
    public void exibirPontuacao(int pJ1, int pJ2, int tipo)
    {
        if (tipo == 1) 
        {
            System.out.println("Jogador 1: "+ pJ1);
            System.out.println("Jogador 2: "+ pJ2);
        } 
        else if (tipo == 2)
        {
            System.out.println("Jogador: "+ pJ1);
            System.out.println("Máquina: "+ pJ2);
        }
    }
    public void exibirCartasJogadores(Jogador J1, Jogador J2, int i)
    {
        System.out.println("Carta do jogador 1 ");
        J1.monteCarta[i].exibirCarta();
        System.out.println("Carta do jogador 2 ");
        J2.monteCarta[i].exibirCarta();
    }
    
    public void iniciarBatalha(Jogador jogador1, Jogador jogador2)
    {
        int pontuacaoJ1 = 0;
        int pontuacaoJ2 = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        
        while (true)
        {
            System.out.println(
                "Você irá jogar contra:?"
                + "\n [1] um amigo"
                + "\n [2] a máquina\n"
            );
            opcao = scanner.nextInt(); 
            
            if (opcao == 1)
            {
                System.out.println("Modo de jogo: Multiplayer.\n");
                break;
            }
            else if (opcao == 2)
            {
                System.out.println("Modo de jogo: Single player.\n");
                break;
            }
            else 
            {
                System.out.println("Insira um valor válido.");
            }
        }
        
        if (opcao == 1)
        {
            for(int i = 0; i < 10; i++)
            {
                System.out.println(
                    "\n\nEscolha um atributo para jogar:?"
                    + "\n [1] Força"
                    + "\n [2] Inteligência"
                    + "\n [3] Defesa"
                    + "\n [4] Fadiga\n"
                );

                int atributo = 0;
                while (true) {
                    atributo = scanner.nextInt(); 

                    if (atributo == 1)
                    {
                        System.out.println("O atributo escolhido foi: Força");
                        break;
                    }
                    else if (atributo == 2)
                    {
                        System.out.println("O atributo escolhido foi: Inteligência");
                        break;
                    }
                    else if (atributo == 3)
                    {
                        System.out.println("O atributo escolhido foi: Defesa");
                        break;
                    }
                    else if (atributo == 4)
                    {
                        System.out.println("O atributo escolhido foi: Fadiga");
                        break;
                    }
                    else 
                    {
                        System.out.println("Escolha uma opção válida");
                    }
                }

                switch(atributo)
                {
                    case 1: 
                        if(jogador1.monteCarta[i].forca > jogador2.monteCarta[i].forca)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;

                            System.out.println("Jogador 1 venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        } 
                        else if(jogador1.monteCarta[i].forca < jogador2.monteCarta[i].forca)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ2++;

                            System.out.println("Jogador 2 venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao); 
                        }
                        else
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;
                            pontuacaoJ2++;

                            System.out.println("Empate!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }
                        break;
                    case 2:
                         if (jogador1.monteCarta[i].inteligencia > jogador2.monteCarta[i].inteligencia)
                         {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;

                            System.out.println("Jogador 1 venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }
                        else if (jogador1.monteCarta[i].inteligencia < jogador2.monteCarta[i].inteligencia)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ2++;

                            System.out.println("Jogador 2 venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao); 
                        }
                        else
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;
                            pontuacaoJ2++;

                            System.out.println("Empate!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }
                        break;
                    case 3:
                        if (jogador1.monteCarta[i].defesa > jogador2.monteCarta[i].defesa)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;

                            System.out.println("Jogador 1 venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }
                        else if (jogador1.monteCarta[i].defesa < jogador2.monteCarta[i].defesa)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ2++;

                            System.out.println("Jogador 2 venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao); 
                        }
                        else
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;
                            pontuacaoJ2++;

                            System.out.println("Empate!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }                
                        break;
                    case 4:
                        if (jogador1.monteCarta[i].fadiga > jogador2.monteCarta[i].fadiga)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;

                            System.out.println("Jogador 1 venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }
                        else if (jogador1.monteCarta[i].fadiga < jogador2.monteCarta[i].fadiga)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ2++;

                            System.out.println("Jogador 2 venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);  
                        }
                        else
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;
                            pontuacaoJ2++;

                            System.out.println("Empate!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }                
                        break;
                }
            }
        }
        else if (opcao == 2)
        {
            int atributo = 0;
            for(int i = 0; i < 10; i++)
            {
                if (i % 2 == 0)
                {
                    System.out.println(
                        "\n\nEscolha um atributo para jogar:?"
                        + "\n [1] Força"
                        + "\n [2] Inteligência"
                        + "\n [3] Defesa"
                        + "\n [4] Fadiga\n"
                    );

                    atributo = 0;
                    while (true) {
                        atributo = scanner.nextInt(); 

                        if (atributo == 1)
                        {
                            System.out.println("O atributo escolhido foi: Força");
                            break;
                        }
                        else if (atributo == 2)
                        {
                            System.out.println("O atributo escolhido foi: Inteligência");
                            break;
                        }
                        else if (atributo == 3)
                        {
                            System.out.println("O atributo escolhido foi: Defesa");
                            break;
                        }
                        else if (atributo == 4)
                        {
                            System.out.println("O atributo escolhido foi: Fadiga");
                            break;
                        }
                        else 
                        {
                            System.out.println("Escolha uma opção válida");
                        }
                    }
                }
                else if (i % 2 != 0)
                {
                    Random obj = new Random();
                    atributo = obj.nextInt(4) + 1;
                    
                    if (atributo == 1)
                    {
                        System.out.println("O atributo escolhido pela máquina foi: Força");
                    }
                    else if (atributo == 2)
                    {
                        System.out.println("O atributo escolhido pela máquina foi: Inteligência");
                    }
                    else if (atributo == 3)
                    {
                        System.out.println("O atributo escolhido pela máquina foi: Defesa");
                    }
                    else if (atributo == 4)
                    {
                        System.out.println("O atributo escolhido pela máquina foi: Fadiga");
                    }
                }

                switch(atributo)
                {
                    case 1: 
                        if(jogador1.monteCarta[i].forca > jogador2.monteCarta[i].forca)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;

                            System.out.println("Você venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        } 
                        else if(jogador1.monteCarta[i].forca < jogador2.monteCarta[i].forca)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ2++;

                            System.out.println("A máquina venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao); 
                        }
                        else
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;
                            pontuacaoJ2++;

                            System.out.println("Empate!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }
                        break;
                    case 2:
                         if (jogador1.monteCarta[i].inteligencia > jogador2.monteCarta[i].inteligencia)
                         {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;

                            System.out.println("Você venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }
                        else if (jogador1.monteCarta[i].inteligencia < jogador2.monteCarta[i].inteligencia)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ2++;

                            System.out.println("A máquina venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao); 
                        }
                        else
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;
                            pontuacaoJ2++;

                            System.out.println("Empate!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }
                        break;
                    case 3:
                        if (jogador1.monteCarta[i].defesa > jogador2.monteCarta[i].defesa)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;

                            System.out.println("Você venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }
                        else if (jogador1.monteCarta[i].defesa < jogador2.monteCarta[i].defesa)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ2++;

                            System.out.println("A máquina venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao); 
                        }
                        else
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;
                            pontuacaoJ2++;

                            System.out.println("Empate!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }                
                        break;
                    case 4:
                        if (jogador1.monteCarta[i].fadiga > jogador2.monteCarta[i].fadiga)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;

                            System.out.println("Você venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }
                        else if (jogador1.monteCarta[i].fadiga < jogador2.monteCarta[i].fadiga)
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ2++;

                            System.out.println("A máquina venceu!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);  
                        }
                        else
                        {
                            exibirCartasJogadores(jogador1, jogador2, i);

                            pontuacaoJ1++;
                            pontuacaoJ2++;

                            System.out.println("Empate!");

                            exibirPontuacao(pontuacaoJ1, pontuacaoJ2, opcao);
                        }                
                        break;
                }
            }
        }
    }
}
