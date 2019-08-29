package br.digitaHouse.Entregavel;

public class Aluno {
    private String nome;
    private String sobrenome;
    private Integer codAluno;

    //CONSTRUTOR DA CLASSE
    public Aluno (String nome,String sobrenome,Integer codAluno){
        this.nome = nome;
        this.sobrenome= sobrenome;
        this.codAluno =codAluno;
    }

    public Aluno() {

    }

    //GETTER
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    //SETTER

    public void setNome(String nNome) {
        this.nome = nNome;
    }

    public void setSobrenome(String nSobrenome) {
        this.sobrenome = nSobrenome;
    }

    public void setCodAluno(Integer nCodAluno) {
        this.codAluno = nCodAluno;
    }


    //METODO DE COMPARACAO DE ALUNOS
    public void verificarAlunos(Integer codAluno){
        if (getCodAluno() == codAluno){
            System.out.println("Aluno do ID " + getCodAluno() + " ja cadastrado! ");
        }else{
            System.out.println("Aluno cadastrado com sucesso ;) ");
        }

    }
}
