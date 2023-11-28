package universidade;

public class Aluno {
    private int numeroMatricula;
    private float indiceDesempenho;

    public Aluno() { 
        this.numeroMatricula = 0;
        this.indiceDesempenho = 0;
    }

    public Aluno(int matricula, float indice) { 
        this.numeroMatricula = matricula;

        if (indice > 10 || indice < 0) {
            System.out.println("O índice fornecido não é permitido!");
        } else {
            this.indiceDesempenho = indice;
        }
    }

    public void aumentaIndiceDesempenho(float valor) { 
        if ((this.indiceDesempenho + valor) < 10) {
           this.indiceDesempenho += valor; 
        } else if (this.indiceDesempenho < 10 && this.indiceDesempenho + valor > 10) {
            this.indiceDesempenho = 10;
        } else {
            System.out.println("O índice de desempenho desse aluno já é máximo!");
        }
    }

    public void diminuiIndiceDesempenho(float valor) { 
        if ((this.indiceDesempenho - valor) > 0) {
            this.indiceDesempenho -= valor;
        } else if (this.indiceDesempenho > 0 && this.indiceDesempenho - valor < 0) {
            this.indiceDesempenho = 0;
        } else {
            System.out.println("O índice de desempenho desse aluno já é mínimo!");
        }
    }

    public void imprime() { 
        System.out.println("Número de matrícula: " + this.numeroMatricula);
        System.out.println("Índice de desempenho: " + this.indiceDesempenho);
    }

}