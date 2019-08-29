package br.digitaHouse.Entregavel;

public class ProfessorAdjunto extends Professor {


    private Integer horasDeMonitoria;


    public ProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer horasDeMonitoria) {
        super(nome, sobrenome,codigoProfessor, horasDeMonitoria);
        this.horasDeMonitoria = horasDeMonitoria;
    }

    public ProfessorAdjunto(){};

    //GET
    @Override
    public String getNomeProfessor() {
        return super.getNomeProfessor();
    }

    @Override
    public Integer getTempoDeCasa() {
        return super.getTempoDeCasa();
    }

    @Override
    public String getSobrenomeProfessor() {
        return super.getSobrenomeProfessor();
    }

    @Override
    public Integer getCodProfessor() {
        return super.getCodProfessor();
    }
    public Integer getHorasDeMonitoria() {
        return horasDeMonitoria;
    }

    //SET


    @Override
    public void setNomeProfessor(String nNomeProfessor) {
        super.setNomeProfessor(nNomeProfessor);
    }

    @Override
    public void setSobrenomeProfessor(String nSobrenomeProfessor) {
        super.setSobrenomeProfessor(nSobrenomeProfessor);
    }

    @Override
    public void setTempoDeCasa(Integer nTempoDeCasa) {
        super.setTempoDeCasa(nTempoDeCasa);
    }

    @Override
    public void setCodProfessor(Integer nCodProfessor) {
        super.setCodProfessor(nCodProfessor);
    }

    public void setHorasDeMonitoria(Integer horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }

    //METODO

    @Override
    public void verificarProfessor(Integer codProfessor) {
        super.verificarProfessor(codProfessor);
    }
}
