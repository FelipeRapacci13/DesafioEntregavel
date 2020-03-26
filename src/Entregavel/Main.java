package Entregavel;

import java.util.ArrayList;

        public class Main {
            public static void main(String[] args) {
                DigitalHouseManager sistema = new DigitalHouseManager();
                sistema.setAlunoDH(new ArrayList<Aluno>());
                sistema.setCursoDH(new ArrayList<Curso>());
                sistema.setProfessoreDH(new ArrayList<Professor>());
                sistema.setMatriculaDH(new ArrayList<Matricular>());

                sistema.registrarCurso("FullSatck", 20001, 3);
                sistema.registrarCurso("Android", 20002, 2);

                sistema.registrarProfessorTitular("Mario", "Silva", 001, 5, "Full Stack");
                sistema.registrarProfessorTitular("Gustavo", "Santos", 002, 6, "FullStack");
                sistema.registrarProfessorAdjunto("kauan", "Oliveira", 003, 7, 5);
                sistema.registrarProfessorAdjunto("Ricardo", "Feliz", 004, 8, 6);


                sistema.alocarProfessores(20001, 001, 003);
                sistema.alocarProfessores(20002, 002, 004);

                sistema.matricularAluno("Felipe", "Rapacci", 1,1,20001);
                sistema.matricularAluno("Bruno", "Perreira", 2,2,20002);
                sistema.matricularAluno("Ana", "Nascimento", 3,3,20001);


            }

}
