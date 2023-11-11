package lab4.poligonos;

/**
 * TrianguloEquilatero
 * Subclasse de Triangulo
 */
public class TrianguloEquilatero extends Triangulo {

    public TrianguloEquilatero(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public double calculaArea() {
        double lado = getLado1();
        double  area = ((Math.pow(lado, 2)*Math.cbrt(3))/4); // area do triangulo equilatero (lado²√3)/4
        return area;
    }

    @Override 
    public void imprimeTipoPoligono() {
        System.out.println("Triângulo Equilátero");
    }

}