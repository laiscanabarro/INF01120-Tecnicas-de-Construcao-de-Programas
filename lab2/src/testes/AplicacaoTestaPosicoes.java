import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoTestaPosicoes{
    private static int MAP_WIDTH = 4;
    private static int MAP_HEIGHT = 4;

    private static void imprimeMapa(ArrayList<PosicaoMapa4x4> posicoes){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                boolean temDrone = false;
                for (PosicaoMapa4x4 posicao : posicoes){
                    if (posicao.getX() == j && posicao.getY() == i){
                        temDrone = true;
                        break;
                    }
                }
                    
                if (temDrone){
                    System.out.print("[X] ");
                } else{
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        PosicaoMapa4x4 p1 = new PosicaoMapa4x4();
        PosicaoMapa4x4 p2 = new PosicaoMapa4x4();
        PosicaoMapa4x4 p3 = new PosicaoMapa4x4();
        Scanner ler = new Scanner(System.in);
        int x, y;
        double d;
        ArrayList<PosicaoMapa4x4> posicoes = new ArrayList<>();

        do{ //pede ao usuario que informe um valor x e y até que sejam valores validos
            System.out.println("Informe um valor inteiro para x entre 0 e 3: ");
            x = ler.nextInt();
            System.out.println("Informe um valor inteiro para y entre 0 e 3: ");
            y = ler.nextInt();

        } while (!(p1.setX(x) && p1.setY(y)));

        p1.imprime(); //imprime os atributos de p1

        do{
            System.out.println("Informe um valor inteiro para x entre 0 e 3: ");
            x = ler.nextInt();
            System.out.println("Informe um valor inteiro para y entre 0 e 3: ");
            y = ler.nextInt();

        } while (!(p2.setX(x) && p2.setY(y)));

        p2.imprime(); //imprime os atributos de p2

        d = p2.distancia(p1); //distancia entre p1 e p2
        System.out.println("Distancia entre p1 e p2" + d);

        p3 = p1.copy(); //copia os valores de p1 para p3
        
        //verificaando se os objetos estão sobrepostos
        if (PosicaoMapa4x4.estaoMesmaPosicao(p1,p2)){
            System.out.println("p1 e p2 estão sobrepostos");
        } else if (PosicaoMapa4x4.estaoMesmaPosicao(p2,p3)){
            System.out.println("p2 e p3 estão sobrepostos");
        } else if (PosicaoMapa4x4.estaoMesmaPosicao(p1,p3)){
            System.out.println("p1 e p3 estão sobrepostos");
        }

        //coloca p1, p2 e p3 na lista de posicoes
        posicoes.add(p1);
        posicoes.add(p2);
        posicoes.add(p3);

        //imprimeMapa mapa atual
        AplicacaoTestaPosicoes.imprimeMapa(posicoes);
        
    }

}

