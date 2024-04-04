package lista03.ex01.share;

public class Square {

    private final float side;


    public Square(float side){
        this.side = side;
    }

    public float calculedArea(){
        return (side * side);
    }

    public float calculedPerimer(){
        return 4 * side;
    }

}
