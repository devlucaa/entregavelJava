package br.digitaHouse.Entregavel;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    //ATRIBUTOS
    private String nomeCurso;
    private Integer codCurso;
    private Integer quantidadeMaxDeAlunos;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;

    List<Aluno> listaAlunos = new ArrayList<>();

    //CONSTRUTOR DA CLASSE
    public Curso (String NomeCurso, Integer CodCurso, Integer quantidadeMaxDeAlunos, ProfessorAdjunto professorAdjunto, ProfessorTitular professorTitular){
        this.nomeCurso = NomeCurso;
        this.codCurso = CodCurso;
        this.quantidadeMaxDeAlunos = quantidadeMaxDeAlunos;
        this.professorAdjunto = professorAdjunto;
        this.professorTitular = professorTitular;
    }

    public Curso(){}

    public Curso(String nome, Integer codCurso, Integer quantidadeMaxAlunos) {
    }

    //GET
    public String getNomeCurso() {
        return nomeCurso;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public Integer getQuantidadeMaxDeAlunos() {
        return quantidadeMaxDeAlunos;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    //SET

    public void setNomeCurso(String nNomeCurso) {
        this.nomeCurso = nNomeCurso;
    }

    public void setCodCurso(Integer nCodCurso) {
        this.codCurso = nCodCurso;
    }

    public void setQuantidadeMaxDeAlunos(Integer quantidadeMaxDeAlunos) {
        this.quantidadeMaxDeAlunos = quantidadeMaxDeAlunos;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }


    //METODO ADICIONAR ALUNO
    public boolean adicionarAluno(Aluno umAluno){
        if (getQuantidadeMaxDeAlunos() + 1 < getQuantidadeMaxDeAlunos()){
            return true;
        }else{
            return false;
        }
    }
    //METODO EXCLUIR ALUNO
    public void excluirUmAluno(Aluno umAluno){
        listaAlunos.remove(umAluno);
        System.out.println("O aluno " + umAluno + " foi removido da lista;");
    }


    //METODO DE COMPARACAO DE ALUNOS
    public void verificarCurso(Integer codCurso){
        if (getCodCurso() == codCurso){
            System.out.println("Curso do ID " + getCodCurso() + " ja cadastrado! ");
        }else{
            System.out.println("Curso cadastrado com sucesso ;) ");
        }

    }
}
