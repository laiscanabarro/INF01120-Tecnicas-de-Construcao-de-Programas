package lab4.poligonos;

/**
 * TrianguloEquilatero
 * Subclasse de Triangulo
 */
public class TrianguloEquilatero extends Triangulo {

    public TrianguloEquilatero(double lado1, double lado2, double lado3) { //construtor que utiliza o construtor da superclasse
        super(lado1, lado2, lado3);
    }

    @Override
    public double calculaArea() { //calcula a area a partir dos lado do triangulo
        double lado = super.getLado1();
        double  area = ((Math.pow(lado, 2)*Math.cbrt(3))/4); // area do triangulo equilatero (lado²√3)/4
        return area;
    }

    @Override 
    public void imprimeTipoPoligono() { //imprime o tipo do triangulo
        System.out.println("Triângulo Equilátero");
    }

}