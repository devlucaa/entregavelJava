package br.digitaHouse.Entregavel;

import java.util.Date;

public class Matricula {
    //ATRIBUTOS
    Aluno aluno ;
    Curso curso;
    private Date dataDoDia = new Date();

    //CONSTRUTOR DA CLASSE
    public Matricula (Aluno aluno, Curso curso, Date dataDoDia){
        this.aluno = aluno;
        this.curso = curso;
        this.dataDoDia = dataDoDia;
    }

    //GETTER

    public Aluno getAluno() {
        return aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public Date getDataDoDia() {
        return dataDoDia;
    }

    //SETTER

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setDataDoDia(Date dataDoDia) {
        this.dataDoDia = dataDoDia;
    }
}
