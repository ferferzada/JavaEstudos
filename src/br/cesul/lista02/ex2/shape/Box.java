package br.cesul.lista02.ex2.shape;

public class Box {


    private double width;

    private double height;

    private double length;


    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void calculeVolume(){
        System.out.println("O TAMANHO DOS GURIS É " +  (width * height * length));
    }
}
