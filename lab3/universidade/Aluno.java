package universidade;

public class Aluno {
    private int numeroMatricula;
    private float indiceDesempenho;

    public Aluno() { //reseta os atributos da classe
        this.numeroMatricula = 0;
        this.indiceDesempenho = 0;
    }

    public Aluno(int matricula, float indice) { //atribui os valores dos parametros aos atributos da classe
        this.numeroMatricula = matricula;

        if (indice > 10 || indice < 0) {
            System.out.println("O índice fornecido não é permitido!");
        } else {
            this.indiceDesempenho = indice;
        }
    }

    public void aumentaIndiceDesempenho(float valor) { //aumenta o indice de desempenho
        if ((this.indiceDesempenho + valor) < 10) {
           this.indiceDesempenho += valor; 
        } else if (this.indiceDesempenho < 10 && this.indiceDesempenho + valor > 10) {
            this.indiceDesempenho = 10;
        } else {
            System.out.println("O índice de desempenho desse aluno já é máximo!");
        }
    }

    public void diminuiIndiceDesempenho(float valor) { //diminui o indice de desempenho
        if ((this.indiceDesempenho - valor) > 0) {
            this.indiceDesempenho -= valor;
        } else if (this.indiceDesempenho > 0 && this.indiceDesempenho - valor < 0) {
            this.indiceDesempenho = 0;
        } else {
            System.out.println("O índice de desempenho desse aluno já é mínimo!");
        }
    }

    public void imprime() { //imprime todas as informacoes do aluno
        System.out.println("Número de matrícula: " + this.numeroMatricula);
        System.out.println("Índice de desempenho: " + this.indiceDesempenho);
    }

}