package br.digitaHouse.Entregavel;

public class Principal {
    public static void main(String[] args) {

        DigitalHouseManager novoDigital = new DigitalHouseManager();

        novoDigital.registrarProfessorTitular("Jessica", "Correa", 22,"Android");
        novoDigital.registrarProfessorTitular("Eliel", "Ebenezer", 33,"Full Stack");
        novoDigital.registrarProfessorAdjunto("Joao","Oliveira",24,0);
        novoDigital.registrarProfessorAdjunto("Cleber", "Joao",30,0);

        novoDigital.registrarCurso("Android", 1,3);
        novoDigital.registrarCurso("Full Stack",20001,3);

        novoDigital.alocarProfessores(22,1,24);
        novoDigital.alocarProfessores(33,2,30);

        novoDigital.registrarAluno("Lucas","Oliveira",10);
        novoDigital.registrarAluno("Jonas","TRUE", 11);
        novoDigital.registrarAluno("Eduardo", "Barba", 12);
        novoDigital.registrarAluno("Rafael", "Chama", 13);
        novoDigital.registrarAluno("Lucas", "Pervetido", 14);
        novoDigital.registrarAluno("Have", "Doidao", 15);

        //MATRICULAR
        novoDigital.matricularAluno(10,1);
        novoDigital.matricularAluno(11,2);
        novoDigital.matricularAluno(12,1);
        novoDigital.matricularAluno(13,2);
        novoDigital.matricularAluno(14,1);
        novoDigital.matricularAluno(15,2);




    }
}
