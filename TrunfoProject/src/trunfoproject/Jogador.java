package trunfoproject;

public class Jogador 
{
    int pontuacao;
    Carta monteCarta[] = new Carta[10];

    public Jogador() 
    {
        pontuacao = 0;
        for(int i = 0 ; i < 10 ; i++)
        {                 
            Carta obj = new Carta();
            monteCarta[i] = obj;
        }
    }
    
    public void exibirCartas() 
    {
        for(int i = 0; i<10; i++)
        {
            monteCarta[i].exibirCarta();
        }
    }  
}