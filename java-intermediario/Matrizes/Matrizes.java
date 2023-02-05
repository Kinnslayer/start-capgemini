package Matrizes;

import javax.swing.JOptionPane;

public class Matrizes {
    public static void main(String[] args) {
        /*
         * Escreva um algoritmo que solicite ao usuário a entrada de 4 notas
         * para cada aluno, calcule a média dos alunos e exiba na tela.
         * Ao final mostrar mostrar a média da turma.
         * Ao lado da média do aluno deve seguir a seguinte regra de negócio:
         * Se média >= 7,5              Aluno aprovado
         * Se média >= 5,5 e < 7,5      Aluno em recuperação
         * Se média < 5,5               Aluno reprovado
         */

        // Vetor dos alunos
        String[] alunos = {"JOÃO", "JOSÉ", "MARIA"};

        // Matriz das notas
        float [][] notas = new float [3][4];

        // Para controlar a somatória das notas de cada aluno
        // Para calcular a média do aluno
        float somaNotas, mediaAluno;
        // Para armazenar o status do aluno e usar para imprimir o boletim
        String statusAluno;

        // Informar as notas dos alunos
        // Laço externo para associar aluno à nota
        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno: " + alunos[i]);
            // Laço interno para informar as notas de cada aluno
            somaNotas = 0;
            mediaAluno = 0;
            for (int j = 0; j < 4; j++) {
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota número " + (j+1) + "do aluno " + alunos[i]));
                somaNotas = somaNotas + notas[i][j];
            }
            mediaAluno = somaNotas / 4;
            if (mediaAluno < 5.5){
                statusAluno = "REPROVADO";
            } else if (mediaAluno >= 5.5 && mediaAluno <= 7.5) {
                statusAluno = "EM RECUPERAÇÃO";
            } else {
                statusAluno = "APROVADO";
            }

            // Impressão do boletim
            System.out.println("\n ==========Boletim==========");
            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Notas");
            for (int j1 = 0; j1 < 4; j1++) {
                System.out.println((j1+1) + " - " + notas[i][j1]);
            }
            System.out.println("Média: " + mediaAluno + " - " + statusAluno);

        }

    }
    
}
