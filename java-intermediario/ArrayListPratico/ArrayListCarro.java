package ArrayListPratico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

    public class ArrayListCarro {
        public static void main(String[] args) {
            // Construindo um arraylist para os carros
        ArrayList<String> carros = new ArrayList<>();

        // Adicionando carros ao arraylist
        carros.add( "FLUENCE");
        carros.add("KOMBI");
        carros.add("JAGUAR");
        carros.add("BMW");
        carros.add("MERCEDES");
        carros.add("FUSCA");
        carros.add("VECTRA");
        carros.add("SANDERO");

        // Mostrando o array
        System.out.println(carros);

    /*  // Substituir MERCEDES por MITSUBISHI
        carros.set(4, "MITSUBISHI");
        // Mostrando o array        
        System.out.println(carros);    

        // Remover Vectra
        carros.remove("VECTRA");
        // Mostrando o array
        System.out.println(carros);

        // Adicionando carros ao arraylist com JOptionPane
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
        // Mostrando o array
        System.out.println(carros);
        
        // Esvaziando o array
        carros.clear();
        // Mostrando o array
        System.out.println(carros);

        // Verificar se o array está vazio
        if (carros.isEmpty()) {
            System.out.println("O vetor está vazio");
        }

        if (carros.contains("BMW")) {
            // Substituindo quando não se sabe a posição
            for (int i = 0; i < carros.size(); i++) {
                if ("BMW".equals(carros.get(i))) {
                    carros.set(i, "BUGATTI");
                    break;
                }
                
            }
        }

        // Mostrando o array
        System.out.println(carros);*/
    }

}  
    