public class Aritmeticos {
    public static void main(String[] args) throws Exception {
        int num1, num2, num3;
        //soma
        num1 = 10;
        num2 = 20;
        num3 = num1 + num2;
        System.out.println("O resultado da soma é: " + num3);

        //subtração
        num1 = 10;
        num2 = 20;
        num3 = num1 - num2;
        System.out.println("O resultado da subtração é: " + num3);

        //multiplicação
        num1 = 10;
        num2 = 20;
        num3 = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + num3);

        //divisão
        num1 = 10;
        num2 = 20;
        num3 = num1 / num2;
        System.out.println("O resultado da divisão é: " + num3);

        System.out.println("=================================");
        // Incrementando (somando de 1 em 1)
        num1 = 1;
        while (num1 <= 10) {           
            System.out.println(num1);
            num1++;
        }

        System.out.println("=================================");
        // Decrementando (subtraindo de 1 em 1)
        num1 = 10;
        while (num1 > 0) {            
            System.out.println(num1);
            num1--;
        }
    }
}
