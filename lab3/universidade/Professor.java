package universidade;

public class Professor {
    private int id;
    private String departamento;

    public Professor() { //reseta os atributos da classe
        this.id = 0;
        this.departamento = " ";
    }

    public Professor(int id, String departamento) { //atribui os valores dos parametros aos atributos da classe
        this.id = id;
        this.departamento = departamento;
    }

    public void setId(int id) { //altera o id do professor conforme o parametro fornecido
        this.id = id;
    }

    public void setDepartamento(String departamento) { //altera o departamento do professor conforme o parametro fornecido
        this.departamento = departamento;
    }
}