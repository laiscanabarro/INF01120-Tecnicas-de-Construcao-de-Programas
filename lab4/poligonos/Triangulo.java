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

    public Triangulo(double base, double altura) { 
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double lado1, double lado2, double lado3) { 
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //getters

    public double getLado1() { 
        return this.lado1;
    }

    public double getLado2() { 
        return this.lado2;
    }

    public double getLado3() { 
        return this.lado3;
    }

    public double getBase() { 
        return this.base;
    }

    public double getAltura() { 
        return this.altura;
    }

    //setters

    public void setLado1(double lado1) { 
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) { 
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) { 
        this.lado3 = lado3;
    }

    public void setBase(double base) { 
        this.base = base;
    }

    public void setAltura(double altura) { 
        this.altura = altura;
    }

    //metodos da interface Poligonos

    public static double calculaArea(double base, double altura){ 
        return (base*altura)/2;
    }

    @Override
    public double calculaArea(){ 
        return(this.base*this.altura)/2;
    }

    @Override
    public abstract void imprimeTipoPoligono();    
}