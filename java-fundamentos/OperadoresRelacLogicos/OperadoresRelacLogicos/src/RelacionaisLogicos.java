public class RelacionaisLogicos {
    public static void main(String[] args) throws Exception {
       // Operadores Relacionais
       // > < <= >= != =

       int num1, num2;
       // Testando uma igualdade 
       num1 = 10;
       num2 = 10;

       if (num1 == num2){
            System.out.println("num 1 e num2 são iguais");
       }

       // Testando uma desigualdade
       num1 = 10;
       num2 = 30;

       if (num1 != num2){
            System.out.println("num 1 e num2 são diferentes");
       }

        // Testando maior
        num1 = 10;
        num2 = 30;
 
        if (num1 > num2){
             System.out.println("num 1 é maior que o num2");
        } else {
            System.out.println("O num2 é maior que o num1");
        }

        // Operadores Lógicos
        // && = e ou AND || = ou / OR
        num1 = 10;
        num2 = 5;
        int num3 = 20, num4 = 5;

        if (num1 > num3 && num2 == num4) {
            System.out.println("Primeira opção satisfeita");
        } else {
            System.out.println("Segunda opção satisfeita");
        }

        num2 = 10;
        if (num1 > num3 || num2 == num4) {
            System.out.println("Primeira opção satisfeita");
        } else {
            System.out.println("Segunda opção satisfeita");
        }

    }
}
