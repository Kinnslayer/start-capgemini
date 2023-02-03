public class LacoRepeticao {
    public static void main(String[] args) throws Exception {
        // Comando while - laço pré testado

        int qtdVezes = 1;

        System.out.println("Comando while ");
        while (qtdVezes <= 10) {
            System.out.println("Estou fazendo a " + qtdVezes + "vez");
            qtdVezes++;
        }
        System.out.println("Saí do laço e executei " + (qtdVezes - 1) + " vezes");


        // Do While - laço pós-testado
        qtdVezes = 1;   
        System.out.println("Comando Do While ");
        do{
            System.out.println("Estou fazendo a " + qtdVezes + "vez");
            qtdVezes++;

        } while (qtdVezes <= 10);
        System.out.println("Saí do laço e executei " + (qtdVezes - 1) + " vezes"); 

        // For
        System.out.println("Comando For ");
        qtdVezes = 0;
        for (int qtdVezes1 = 0; qtdVezes1 <= 10; qtdVezes1++) {
            System.out.println("Estou fazendo a " + qtdVezes1 + "vez");
            qtdVezes = qtdVezes1;
        }
        System.out.println("Saí do laço e executei " + (qtdVezes) + " vezes"); 

        for (int qtdVezes1 = 0; qtdVezes1 <= 10; qtdVezes1++) {
            System.out.println("Estou fazendo a " + qtdVezes1 + "vez");
            if (qtdVezes1 == 5) {
                System.out.println("Parei na " + qtdVezes1 + "vez");
                break;
            }
        }
    }
}
