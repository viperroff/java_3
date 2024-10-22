public class Square {
    private Point topLeft;
    private int sideLength;

    public Square(Point topLeft, int sideLength) {
        this.topLeft = topLeft;
        this.sideLength = sideLength;
    }

    public Square(int x, int y, int sideLength) {
        this.topLeft = new Point(x, y);
        this.sideLength = sideLength;
    }

    public Polyline getPolyline() {
        Point topRight = new Point(topLeft.getX() + sideLength, topLeft.getY());
        Point bottomRight = new Point(topLeft.getX() + sideLength, topLeft.getY() - sideLength);
        Point bottomLeft = new Point(topLeft.getX(), topLeft.getY() - sideLength);

        return new Polyline(topLeft, topRight, bottomRight, bottomLeft, topLeft);
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + topLeft + " со стороной " + sideLength;
    }
}