package MetodosJava3;

public class Main {
    public static void main(String[] args) {

        // Quadrilatero
        System.out.println("Exercicio Quadrilatero:");

        double areaQuadrado = Quadrilateros.area(5);
        System.out.println("Area do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilateros.area(4, 8);
        System.out.println("Area do rentangulo:" + areaRetangulo);

        double areaTrapezio = Quadrilateros.area(2, 3, 4);
        System.out.println("Area do trapezio:" + areaTrapezio);
    }

}
