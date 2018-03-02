import java.util.Scanner;

public abstract class ClassFigura {

    protected String name;
    protected int height;
    protected int width;

    Scanner scanner;

    public ClassFigura(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getSquare();
}
