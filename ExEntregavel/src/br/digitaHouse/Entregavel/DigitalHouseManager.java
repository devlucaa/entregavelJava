package br.digitaHouse.Entregavel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {

    List<Aluno> listaAlunos = new ArrayList<>();
    List<Professor> listaProfessores = new ArrayList<>();
    List<Curso> listaCursos = new ArrayList<>();
    List<Matricula> listaMatriculas = new ArrayList<>();


    //METODO REGISTRANDO CURSO
    public void registrarCurso (String nomeCurso, Integer codCurso, Integer quantidadeMaxAlunos){
        Curso nCurso = new Curso(nomeCurso,codCurso, quantidadeMaxAlunos,null , null  );
        listaCursos.add(nCurso);
        System.out.println("Curso " +nomeCurso+ " adicionado com sucesso!");
    }

    //METODO EXCLUINDO CURSO
    public void excluirCurso (Integer codCurso){
        Curso acheiCurso = null;
        for (Curso novoCurso : listaCursos){
            if (codCurso.equals(novoCurso.getCodCurso())){
                acheiCurso = novoCurso;
                break;
            }
        }
        if (listaCursos.remove(acheiCurso)){
            System.out.println("Curso removido");
        }else{
            System.out.println("Curso nao encontrado");
        }
    }

    //METODO REGISTRAR PROFESSOR TITULAR
    public void registrarProfessorTitular(String nomeProfessor, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTitular nProfessorTitular = new ProfessorTitular(nomeProfessor, sobrenome, especialidade, codigoProfessor, 0);
        listaProfessores.add(nProfessorTitular);
        System.out.println("Professor " + nomeProfessor + " " + sobrenome + " Adicionado com Sucesso!");
    }

    //METODO REGISTRAR PROFESSOR ADJUNTO
    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        ProfessorAdjunto nProfessorAdjunto = new ProfessorAdjunto(nome,sobrenome,codigoProfessor,0);
        listaProfessores.add(nProfessorAdjunto);
        System.out.println("Professor " + nome + " " + sobrenome + " Adicionado!");

    }

    //METODO EXCLUIR PROFESSOR
    public void excluirProfessor(Integer codProfessor){
        Professor acheiProfessor = null;
        for (Professor novoProfessor : listaProfessores){
            if (codProfessor.equals(novoProfessor.getCodProfessor())){
                acheiProfessor = novoProfessor;
                break;
            }
        }
        if (listaProfessores.remove(acheiProfessor)){
            System.out.println("Professor removido");
        }else{
            System.out.println("Professor nao encontrado");
        }
    }

    //METODO REGISTRAR ALUNO
    public void registrarAluno(String nome, String sobrenome,Integer codigoAluno){
        Aluno nAluno = new Aluno(nome,sobrenome,codigoAluno);
        listaAlunos.add(nAluno);
        System.out.println("Aluno " + nome + sobrenome + " Adicionado com Sucesso!");
    }

    //METODO MATRICULAR ALUNO
    public void matricularAluno(Integer codAluno, Integer codCurso){
        Aluno acheiAluno = null;
        for (Aluno nAluno : listaAlunos){
            if (nAluno.getCodAluno().equals(codAluno)) {
                acheiAluno = nAluno;
            }
        }
        Curso acheiCurso = null;
        for (Curso nCurso : listaCursos) {
            if (nCurso.getCodCurso().equals(codAluno)) {
                acheiCurso = nCurso;
            }
        }
        Matricula nMatricula = new Matricula(acheiAluno,acheiCurso, new Date());
        listaMatriculas.add(nMatricula);
        System.out.println("Aluno Matriculado com sucesso!");
    }

    //METODO ALOCAR PROFESSORES
    public void alocarProfessores (Integer codProfessorTitular, Integer codCurso, Integer codProfessorAdjunto){
        Professor acheiProfessorT = null;
        for (Professor nProfessorTitular : listaProfessores){
            if (nProfessorTitular.getCodProfessor().equals(codProfessorTitular)){
                acheiProfessorT = nProfessorTitular;
            }
        }

        Professor acheiProfessorA = null;
        for (Professor nProfessorAdjunto : listaProfessores){
            if (nProfessorAdjunto.getCodProfessor().equals(codCurso)){
                acheiProfessorA = nProfessorAdjunto;
            }
        }
        Curso acheiCurso = null;
        for (Curso nCurso : listaCursos){
            if (nCurso.getCodCurso().equals(codCurso)){
                nCurso.setProfessorTitular((ProfessorTitular)acheiProfessorT);
                System.out.println("Professor Titular " + acheiProfessorT.getNomeProfessor() + " Adicionado ao Curso " + nCurso.getNomeCurso());
                nCurso.setProfessorAdjunto((ProfessorAdjunto)acheiProfessorA);
                System.out.println("Professor Adjunto " + acheiProfessorA.getNomeProfessor() + " Adicionado ao Curso " + nCurso.getNomeCurso());
            }
        }
    }




}
