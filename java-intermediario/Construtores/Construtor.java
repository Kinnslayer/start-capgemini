package Construtores;

import Construtores.Aluno.STATUS;
import Construtores.Aluno.MATRICULA;

public class Construtor {
    public static void main(String[] args) {
        // Passsando os dados através de um construtor com sobrecarga
        Aluno aluno = new Aluno(8, 8, 8);
        // Calculando a média
        double mediaAlunoFinal = aluno.calcularMediaAluno();

        // Definindo situação do aluno
        if (mediaAlunoFinal < 6) {
            aluno.situacaoAluno = STATUS.REPROVADO;
        } else {
            aluno.situacaoAluno = STATUS.APROVADO;
        }

        // Imprimindo situação do aluno 
        System.out.println("A média do aluno é " + aluno.calcularMediaAluno() + " " + "e o aluno está aprovado!");

        // Usando enum MATRICULA
        aluno.situacaoMatricula = MATRICULA.MATRICULADO;
        System.out.println("O aluno está: " + aluno.situacaoMatricula);

    }
    
}
