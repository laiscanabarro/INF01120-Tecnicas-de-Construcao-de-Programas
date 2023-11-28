package lab4.poligonos;

/**
 * TrianguloIsosceles
 * Subclasse de Triangulo
 */
public class TrianguloIsosceles extends Triangulo {

    public TrianguloIsosceles(float lado1, float lado2, float lado3) { 
        super(lado1, lado2, lado3);
    } 

    @Override
    public double calculaArea() { 
        setAltura(calculaAltura());
        return super.calculaArea();
    }

    @Override
    public void imprimeTipoPoligono() { 
        System.out.println("Triângulo Isósceles");
    }

    private double calculaAltura() { 
        double ladoA = 0;
        double base = 0;
        double altura;

        //compara os lados do triangulo para encontrar qual eh a base e quais sao os outros lados
        if (super.getLado1() == super.getLado2()) {
            ladoA = super.getLado1();
            base = super.getLado3();

        } else if (super.getLado1() == super.getLado3()) {
            ladoA = super.getLado1();
            base = super.getLado2();

        } else if (super.getLado2() == super.getLado3()) {
            ladoA = super.getLado2();
            base = super.getLado1();
        }

        altura = Math.sqrt((Math.pow(ladoA, 2)) - (Math.pow(base, 2)/4)); //altura do triangulo isosceles √(a² - (b²/4))
        super.setBase(base);
        return altura;
    }

}