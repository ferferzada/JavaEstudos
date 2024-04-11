package br.cesul.lista02.ex08.draw;

import java.util.Random;

public class Draw {


    private int num;

    private  int tentativaEmIngles;
    public Draw(){
        Random random = new Random();
        this.tentativaEmIngles = 0;
        this.num = random.nextInt(100);
    }

    public boolean guess(int guess){
        if(tentativaEmIngles != 10){
            if(num==guess){
                return true;
            }
            tentativaEmIngles++;
            return false;
        }else{
            mensagemDeDerrota();
            return false;
        }
    }

    public void  mensagemDeDerrota(){
        System.out.println("VOCE PERDEU CABEÇO");
    }
}


