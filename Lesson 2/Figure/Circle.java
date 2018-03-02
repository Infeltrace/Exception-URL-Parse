public class Circle extends Rectangle {

    private int radius;

    public Circle(int width, int height){
        super(height,width);
    }

    public Circle(int radius) {
        super();
        this.radius = radius;
    }


    @Override
    public double getSquare() {
        return Math.PI*radius*radius;
    }
}
