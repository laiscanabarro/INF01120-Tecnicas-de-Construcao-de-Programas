package lab4.poligonos;

/**
 * Triangulo
 * Superclasse abstrata que implementa a interface Poligono
 */
public abstract class Triangulo implements Poligono {
    private double lado1, lado2, lado3;
    private double base;
    private double altura;

    //construtores

    public Triangulo(double base, double altura) { //construtor da classe que recebe a altura e base como parametros
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double lado1, double lado2, double lado3) { //construtor da classe que recebe os lados como parametros
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //getters

    public double getLado1() { //retorna o lado 1 do triangulo
        return this.lado1;
    }

    public double getLado2() { //retorna o lado 2 do triangulo
        return this.lado2;
    }

    public double getLado3() { //retorna o lado 3 do triangulo
        return this.lado3;
    }

    public double getBase() { //retorna a base do triangulo
        return this.base;
    }

    public double getAltura() { //retorna a altura do triangulo
        return this.altura;
    }

    //setters

    public void setLado1(double lado1) { //define um valor para o atributo lado 1
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) { //define um valor para o atributo lado 2
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) { //define um valor para o atributo lado 3
        this.lado3 = lado3;
    }

    public void setBase(double base) { //define um valor para o atributo base
        this.base = base;
    }

    public void setAltura(double altura) { //define um valor para o atributo altura
        this.altura = altura;
    }

    //metodos da interface Poligonos

    public static double calculaArea(double base, double altura){ //calcula a area do triangulo a partir dos parametros fornecidos
        return (base*altura)/2;
    }

    public double calculaArea(){ //calcula a area do triangulo a partir de seus atributos de base e altura
        return(this.base*this.altura)/2;
    }

    public abstract void imprimeTipoPoligono();    
}