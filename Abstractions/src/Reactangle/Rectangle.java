package Reactangle;

import Reactangle.Point;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(int firstPoint, int secondPoint) {
        return firstPoint >= bottomLeft.getX() &&
                firstPoint <= topRight.getX() &&
                secondPoint >= bottomLeft.getY() &&
                secondPoint <= topRight.getY();
    }


}
