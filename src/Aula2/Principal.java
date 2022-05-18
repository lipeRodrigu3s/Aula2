package Aula2;
public class Principal {
  public static void main(String[] args){

      double areaQuadrado = Quadrilatero.area(5);

      System.out.println("Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,7);

        System.out.println("retângulo: "+ areaRetangulo);

        double areaTrapezio = Quadrilatero.area(5,7,9);

        System.out.println("Trapezio: " + areaTrapezio);

    }
}
