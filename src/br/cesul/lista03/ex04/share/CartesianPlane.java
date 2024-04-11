package br.cesul.lista03.ex04.share;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CartesianPlane {

    List<Point> points = new ArrayList<>();

    public CartesianPlane(){


        for (int i = 0; i < 5; i++) {
            Random random = new Random(1242);
            double randomX = random.nextDouble(-10, 10);
            double randomY = random.nextDouble(-1,6);
            Point point = new Point(randomX, randomY);
            points.add(point);
        }
        points.sort((p1, p2) -> {
            if (p1.getAxleX() > p2.getAxleX()) {
                return 1;
            } else if (p1.getAxleX() < p2.getAxleX()) {
                return -1;
            } else {
                return 0;
            }
        });
    }


    public void SearyArea(){
        for (Point point : points) {
            if(point.getAxleX() > 0 && point.getAxleY() > 0){
                System.out.println("First Quadrant: X:" + point.getAxleY() +" e Y:"+ point.getAxleY());
            }else if(point.getAxleX() < 0 && point.getAxleY() > 0){
                System.out.println("Second Quadrant: X:" + point.getAxleY() +" e Y:"+ point.getAxleY());
            }else if(point.getAxleX() < 0 && point.getAxleY() < 0){
                System.out.println("Third Quadrant: X:" + point.getAxleY() +" e Y:"+ point.getAxleY());
            }else if(point.getAxleX() > 0 && point.getAxleY() < 0){
                System.out.println("Fourth Quadrant:  X:" + point.getAxleY() +" e Y:"+ point.getAxleY());
            }

        }
    }

    public void DistancForPoints(){
        for (int i = 1; i < points.size(); i++) {
            Point point  = points.get(i-1);
            Point point2 = points.get(i);
            double distance = Math.sqrt((Math.pow(point.getAxleX(),2) - Math.pow(point.getAxleY(),2)) - ((Math.pow(point2.getAxleX(),2) - Math.pow(point2.getAxleY(),2))) );
            System.out.println("Distance for next point is " + distance);

        }
        
        
    }
   
    
}
