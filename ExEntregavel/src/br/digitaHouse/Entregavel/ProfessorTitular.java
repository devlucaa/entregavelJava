package br.digitaHouse.Entregavel;

public class ProfessorTitular extends Professor {

    private String especialidade;


    public ProfessorTitular(String nome, String sobrenome, String especialidade, Integer codigoProfessor, Integer tempoDeCasa) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor, especialidade);
        this.especialidade = especialidade;
    }

    public ProfessorTitular(){};

    //GET

    public String getEspecialidade() {
        return especialidade;
    }

    //SETTER

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
