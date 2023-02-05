package LinkedListPratico;

import java.util.LinkedList;

public class LinkedListCarro {
    public static void main(String[] args) {
       /*  
        addFirst()
        addLast()
        removeFirst()
        removeLast()
        getFirst()
        getLast()
        */

    LinkedList<String> cars = new LinkedList<>();
    cars.add("Volvo");
    cars.add("BMW");    
    cars.add("Ford");   
    System.out.println(cars);

    // Incluindo Mazda no início
    cars.addFirst("Mazda");
    System.out.println(cars);

    // Incluindo Bugatti no fim
    cars.addLast("Bugatti");
    System.out.println(cars);

    String carro;
    carro = cars.get(3);
    System.out.println(carro);

    // Removendo o primeiro
    cars.removeFirst();
    System.out.println(cars);

    // Removendo o último
    cars.removeLast();
    System.out.println(cars);

    // Pega o primeiro
    System.out.println(cars.getFirst());
    System.out.println(cars);

    // Pega o último
    System.out.println(cars.getLast());
    System.out.println(cars);

    cars.clear();
    if (cars.isEmpty()) {
        System.out.println("LinkedList está vazio");
    }

    }
}
