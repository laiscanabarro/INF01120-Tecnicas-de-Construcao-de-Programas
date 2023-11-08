public class PosicaoMapa4x4{
    private int x; //posicao do drone no grid
    private int y;
    private static int numPosicoesOcupadas; //numero atual de drones existentes

    public PosicaoMapa4x4(){ //invoca o metodo reset
        reset();
    } 

    public PosicaoMapa4x4(int x, int y){ //atribui os valores passados para os atributos x e y
        this.x = x;
        this.y = y;
    }

    public boolean setX(int x){ //atribui um valor x ao atributo this.x
        if (this.x >=0 && this.x < 4){
            this.x = x;
            return true;
        } else{
            reset();
            return false;
        }
    }

    public boolean setY(int y){ //atriubui um valor y ao atributo this.y
        if (this.y >=0 && this.y < 4){
            this.y = y;
            return true;
        } else{
            reset();
            return false;
        }
    }

    public int getX(){ //retorna o valor do atributo x
        return this.x;
    }

    public int getY(){ //retorna o valor do atributo y
        return this.y;
    }

    public static int getNumPosicoesOcupadas(){ //retona o valor do atributo numPosicoesOcupadas
        return numPosicoesOcupadas;
    }

    public PosicaoMapa4x4 copy(){ //retorna um objeto PosicaoMapa4x4
        PosicaoMapa4x4 posicao = new PosicaoMapa4x4(this.x, this.y);
        return posicao;
    }

    public void imprime(){ //mostra na tela os valores dos atributos x e y
        System.out.printf("(%d, %d)\n", this.x, this.y);
    }

    public int distancia(PosicaoMapa4x4 p){ //retorna a distancia de Manhattan entre o objeto corrente e o objeto paramentro
        int dM;
        int x = p.getX();
        int y = p.getY();
        dM = Math.abs(this.x - x) + Math.abs(this.y - y);

        return dM;
    }

    private void reset(){ //atribui zero aos atributos x e y
        this.x = 0;
        this.y = 0;
    }

    public static boolean estaoMesmaPosicao(PosicaoMapa4x4 p1, PosicaoMapa4x4 p2){ //retorna true se os dois objetos passada como paramentro estao na mesma posicao
        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()){
            return true;
        } else{
            return false;
        }
    }
}