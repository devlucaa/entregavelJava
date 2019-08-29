package br.digitaHouse.Entregavel;

public abstract class Professor {
    private String nomeProfessor;
    private String sobrenomeProfessor;
    private Integer tempoDeCasa;
    private Integer codProfessor;

    //CONSTRUTOR DA CLASSE
    public Professor(String nNomeProfessor, String nSobrenomeProfessor, Integer nTempoDeCasa, Integer nCodProfessor, String especialidade){
        this.nomeProfessor = nNomeProfessor;
        this.sobrenomeProfessor = nSobrenomeProfessor;
        this.tempoDeCasa = nTempoDeCasa;
        this.codProfessor = nCodProfessor;
    }

    public Professor(String nome, String sobrenome, int tempoDeCasa, int codigoProfessor) {
    }

   public Professor(){};

    //GETTER
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getSobrenomeProfessor() {
        return sobrenomeProfessor;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public Integer getCodProfessor() {
        return codProfessor;
    }

    //SETTER

    public void setNomeProfessor(String nNomeProfessor) {
        this.nomeProfessor = nNomeProfessor;
    }

    public void setSobrenomeProfessor(String nSobrenomeProfessor) {
        this.sobrenomeProfessor = nSobrenomeProfessor;
    }

    public void setTempoDeCasa(Integer nTempoDeCasa) {
        this.tempoDeCasa = nTempoDeCasa;
    }

    public void setCodProfessor(Integer nCodProfessor) {
        this.codProfessor = nCodProfessor;
    }


    //METODO DE COMPARACAO DE ALUNOS
    public void verificarProfessor(Integer codProfessor){
        if (getCodProfessor() == codProfessor){
            System.out.println("Professor do ID " + getCodProfessor() + " ja cadastrado! ");
        }else{
            System.out.println("Professor cadastrado com sucesso ;) ");
        }

    }
}
