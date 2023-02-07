package ComandoForEach;

public class ComandoForEach {
    public static void main(String[] args) {
        // Vamos a um exemplo prático
        // Eu vou criar um vetor, carregá-lo já inicializado e em seguida vou
        // ler os elementos do vetor utilizando o ForEach

        int[] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9,10};

        // Varrendo o vetor sem uso do For Each

        System.out.println("Varrendo o vetor sem o For Each");
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Nr: " + vetorNumeros[i]);
        }

        // Varrendo o vetor utilizando o For Each
        System.out.println("Varrendo o vetor com o For Each");
        for (int listaNumeros : vetorNumeros) {
            System.out.println("Nr: " + listaNumeros);
        }
    }
}
