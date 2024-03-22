package lista02.ex2;

public class Retangular {

    private double volume;

    private double comprimento;

    private double largura;

    private double altura;


    public Retangular(double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public void calculeArea(){
        this.volume = (comprimento * largura * altura);
        System.out.println("O TAMANHO DOS GURIS É " + volume);
    }
}
