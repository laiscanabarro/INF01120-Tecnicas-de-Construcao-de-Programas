// PARTE 2 - Construcao da classe ProgramaPrincipal
public class ProgramaPrincipal{
    public static void main(String[] args){
        Imovel im1, im2; 

        im1 = new Imovel(); 
        im2 = new Imovel(); 
        
        // im1
        im1.nQuartos = 2;
        im1.nBanheiros = 1;
        im1.temGaragem = false;
        im1.endereco = "Rua Azul, n. 123";
        im1.aluguel = true;
        im1.valorVenda = 500000;
        
        // PARTE 4 - Teste dos metodos da instancia m1
        im1.imprimeDados();
        im1.valoriza(3.2);
        im1.imprimeDados();
        double imposto = im1.calculaImposto();
        System.out.println("Imposto Incidente: " + imposto + "\n\n");

        // PARTE 5 - Instanciacao de im2 e comparacao com im1

        // atribuicao dos dados de im1 em im2
        im2.nQuartos = 2;
        im2.nBanheiros = 1;
        im2.temGaragem = false;
        im2.endereco = "Rua Azul, n. 123";
        im2.aluguel = true;
        im2.valorVenda = 500000;

        im2.valoriza(3.2);
 
        if (im1 == im2){
            System.out.println("Menos imoveis!\n\n");
        } else{
            System.out.println("Imoveis distintos!\n\n");
        }

        /* RESPOSTA PARA QUESTAO NA PARTE 5
        
        Ao comparar as instancias im1 e im2 atraves de "im1 == im2", a saida é "Imoveis distintos!", mesmo recebendo os mesmos atributos.
        Isso ocorre, pois essa comparacao acontece entre as referencias de objeto, e nao dos atributos do objeto.
        
        */

        // PARTE 6 - Declaracao da variavel im3 e atribuicao de im1 a ela
        
        Imovel im3 = im1;
        im3.valorVenda = 0; // Imovel com perda total
        im3.imprimeDados();
        im1.imprimeDados();

        /* RESPOSTA PARA QUESTAO NA PARTE 6

        Na atribuição "Imovel im3 = im1", é criado uma nova referência im3 que aponta para a mesma instância de objeto que im1. 
        Assim, im3 e im1 se referem ao mesmo objeto na memória. Portanto, nesse caso, valorVenda assume o valor 0 e os outros 
        dados dos atributos permanecem iguais ao que estavam em im1, tanto para im1 quanto para im3.

         */

    }
}