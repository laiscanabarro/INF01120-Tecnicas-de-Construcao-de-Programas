// PARTE 1 - Construcao da classe Imovel
public class Imovel{
    int nQuartos;
    int nBanheiros;
    boolean temGaragem;
    String endereco;
    boolean aluguel;
    double valorVenda;

    // PARTE 3 - Implementacao dos metodos da classe Imovel
    // imprimeDados: apresenta na tela todos os dados do imovel
    public void imprimeDados(){
        System.out.println("Quartos: " + nQuartos);
        System.out.println("Banheiros: " + nBanheiros);
        
        if (temGaragem){
            System.out.println("Garagem: Sim");
        } else {
            System.out.println("Garagem: Não");
        }

        System.out.println("Endereço: " + endereco);

        if (aluguel){
            System.out.println("Aluguel: Sim");
        }
        else {
            System.out.println("Aluguel: Não");
        }

        System.out.println("Valor: " + valorVenda + "\n\n");
    }

    /* 
      calculaImpostos: retorna a valor dos impostos incidentes 
      dependendo o valorVenda e se o imóvel esta disponivel para alugar ou venda:
       * venda: 12.0% do valor de venda
       * aluguel: 8.0% do valor de venda
     */
    public double calculaImposto(){
        double impostos;
        if (aluguel){
            impostos = (valorVenda*8)/100;
        } else {
            impostos = (valorVenda*12)/100;
        }
        return impostos;
    }

    /* 
      valoriza: aumenta perc por cento (%) do atributo
      valorVenda, simulando a valorizacao de um imovel
     */
    public void valoriza(double perc){
        valorVenda *= (1 + (perc/100));
    }

}
