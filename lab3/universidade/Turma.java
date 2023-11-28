package universidade;
import universidade.*;
import java.util.List;
import java.util.ArrayList;

public class Turma {
    private int numAlunos;
    private int numMonitores;
    private Professor professor;
    private ArrayList<Monitor> monitores = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();

    final int MAX_ALUNOS_TURMA = 40; 
    final int MIN_ALUNOS_TURMA = 10;
    final int MAX_MONITORES_TURMA = 3;

    public Turma() { 
        this.numAlunos = 0;
        this.numMonitores = 0;
        this.professor = new Professor();
        this.monitores = new ArrayList<Monitor>();
        this.alunos = new ArrayList<Aluno>();
    }

    public Turma(Professor professor, ArrayList<Monitor> monitores, ArrayList<Aluno> alunos) { 
        this.numAlunos = alunos.size();
        if (numAlunos > MAX_ALUNOS_TURMA) {
            System.out.println("O número de alunos é maior que o permitido.");
            this.numAlunos = 0;
        } else if (numAlunos < MIN_ALUNOS_TURMA) {
            System.out.println("O número de alunos é menor que o permitido");
        } else {
            this.alunos = alunos;
        }

        this.numMonitores = monitores.size();
        if (numMonitores > MAX_MONITORES_TURMA) {
            System.out.println("O número de alunos é maior que o permitido.");
            this.numMonitores = 0;
        } else {
            this.monitores = monitores;
        }

        this.professor = professor;
    }

    public int getNumAlunos() { 
        return this.numAlunos;
    }

    public int getNumMonitores() { 
        return this.numMonitores;
    }

    public void setProfessor(Professor professor) { 
        this.professor = professor;
    }

    public void setMonitores(ArrayList<Monitor> monitores) { 
        if ((monitores.size()) > MAX_MONITORES_TURMA) {
            System.out.println("O número de monitores é maior que o permitido.");
        } else {
            this.monitores = monitores;
        }
    }

    public void setAlunos(ArrayList<Aluno> alunos) { 
        if ((alunos.size()) > MAX_ALUNOS_TURMA) {
            System.out.println("O número de alunos é maior que o permitido.");
        } else if ((alunos.size()) < MIN_ALUNOS_TURMA) {
            System.out.println("O número de alunos é menor que o permitido");
        } else {
            this.alunos = alunos;
        }
    }

    public void adicionaAluno(Aluno aluno) { 
        if ((this.alunos.size()) < MAX_ALUNOS_TURMA) {
            this.alunos.add(aluno);
        } else {
            System.out.println("A turma já está cheia. Não é possível adicionar mais alunos.");
        }
    }

    public void removeAluno() { 
        if ((this.alunos.size()) > MIN_ALUNOS_TURMA) {
            int indice = this.alunos.size() - 1;
            this.alunos.remove(indice);
        } else {
            System.out.println("A turma está com o limite mínimo de alunos. Não é possível remover mais alunos da turma.");
        }
        
    }

    public void imprimeAlunos() { 
        for (int i = 1; i <alunos.size() + 1; i++) {
            System.out.printf("Aluno %d: \n", i);
            alunos.get(i - 1).imprime();
        }
    }
}