package GenericsCourse.Embarque;

import GenericsCourse.Controle.Aeronaves;

import java.util.Scanner;

/*
 * Informar a quantidade de aeronaves no pátio, o nr de vôos por ordem de chegada.
 * A ordem de decolagem é FIFO, o primeiro que entra é o primeiro que sai.
 * Mostrar qual o primeiro vôo à decolar.
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aeronaves air = new Aeronaves();
        System.out.println("Informe o nr de aeronaves");
        int nrAeronaves = scanner.nextInt();

        // Adicionando vôos
        for (int i = 0; i < nrAeronaves; i++) {
            int nrVoo = scanner.nextInt();
            air.addVoo(nrVoo);
        }
        System.out.println("O primeiro a decolar vai ser o nr: " + air.primeiroVoo());
        air.listaVoos();
        scanner.close();
    }
    
}
