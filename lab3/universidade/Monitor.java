package universidade;

public class Monitor {
    private int semestreAtual;
    private boolean temExperiencia;

    public Monitor() { //reseta os atributos da classe
        this.semestreAtual = 0;
        this.temExperiencia = false;
    }

    public Monitor(int semestre, boolean experiencia) { //atribui os valores dos parametros para os atributos da classe
        this.semestreAtual = semestre;
        this.temExperiencia = experiencia;
    }

}