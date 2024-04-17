package br.cesul.lista02.ex08.app;

import br.cesul.lista02.ex08.draw.Draw;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        Random random =  new Random();
        Draw draw =  new Draw();
        while (true){
            int userGuess =  random.nextInt(10);
            boolean guessResult = draw.guess(userGuess);
            System.out.println("PALPITE: "+userGuess);
            if(guessResult){
                System.out.println("\n US GURI É CRIMINOSO");
                break;
            }else{
                System.out.println("\nGEME MEU NOME");
            }
        }
    }
}
