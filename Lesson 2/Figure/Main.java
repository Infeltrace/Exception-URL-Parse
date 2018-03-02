import java.util.Scanner;

public class Main {

    private static double getSquare(ClassFigura clf){
       return clf.getSquare();
    }

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle(5,7);

        System.out.println("Введите первую сторону:");
        triangle.setA(scanner.nextInt());
        System.out.println("Введите первую вторую:");
        triangle.setB(scanner.nextInt());
        System.out.println("Введите первую третюю:");
        triangle.setC(scanner.nextInt());

        System.out.println("Triangle square: " + triangle.getSquare());
        System.out.print("Rectangle square: " + rectangle.getSquare());

        System.out.println(getSquare(rectangle));

    }
}
