package lab4.poligonos;

/**
 * Triangulo
 * Superclasse abstrata que implementa a interface Poligono
 */
public abstract class Triangulo implements Poligono {
    private float lado1, lado2, lado3;
    private float base;
    private float altura;

    //construtores

    public Triangulo(float base, float altura) { //construtor da classe que recebe a altura e base como parametros
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(float lado1, float lado2, float lado3) { //construtor da classe que recebe os lados como parametros
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //getters

    public float getLado1() { //retorna o lado 1 do triangulo
        return this.lado1;
    }

    public float getLado2() { //retorna o lado 2 do triangulo
        return this.lado2;
    }

    public float getLado3() { //retorna o lado 3 do triangulo
        return this.lado3;
    }

    public float getBase() { //retorna a base do triangulo
        return this.base;
    }

    public float getAltura() { //retorna a altura do triangulo
        return this.altura;
    }

    //setters

    public void setLado1(float lado1) { //define um valor para o atributo lado 1
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) { //define um valor para o atributo lado 2
        this.lado2 = lado2;
    }

    public void setLado3(float lado3) { //define um valor para o atributo lado 3
        this.lado3 = lado3;
    }

    public void setBase(float base) { //define um valor para o atributo base
        this.base = base;
    }

    public void setAltura(float altura) { //define um valor para o atributo altura
        this.altura = altura;
    }

    //metodos da interface Poligonos

    public static float calculaArea(float base, float altura){ //calcula a area do triangulo a partir dos parametros fornecidos
        return (base*altura)/2;
    }

    public float calculaArea(){
        return(this.base*this.altura)/2;
    }

    public abstract void imprimeTipoPoligono();    
}