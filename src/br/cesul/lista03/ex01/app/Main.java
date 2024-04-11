package br.cesul.lista03.ex01.app;

import br.cesul.lista03.ex01.share.Square;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square square = new Square(side);
        System.out.println("Area of square is " + square.calculedArea());
        System.out.println("Perimeter of square is " + square.calculedPerimer());
    }
}
