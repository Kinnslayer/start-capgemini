package GenericsCourse.Embarque;

import java.util.Scanner;

import GenericsCourse.Controle.AeronavesComGenerics;

public class PrincipalComGenerics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AeronavesComGenerics<Integer> air = new AeronavesComGenerics<>();
        System.out.println("Informe o nr de aeronaves");
        int nrAeronaves = scanner.nextInt();

        //adicionando Vôo
        for (int i = 0; i < nrAeronaves; i++) {
            Integer nrVoo = scanner.nextInt();
            air.addVoo(nrVoo);
        }
        air.primeiroVoo();
        Integer x = (Integer) air.primeiroVoo();
        System.out.println("O primeiro a decolar é o vôo: " + x);
        scanner.close();
    }
}
