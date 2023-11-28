package universidade;

public class Monitor {
    private int semestreAtual;
    private boolean temExperiencia;

    public Monitor() { 
        this.semestreAtual = 0;
        this.temExperiencia = false;
    }

    public Monitor(int semestre, boolean experiencia) { 
        this.semestreAtual = semestre;
        this.temExperiencia = experiencia;
    }

}