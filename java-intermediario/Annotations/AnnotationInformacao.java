package Annotations;

class DeprecatedTeste {
    void visualizar(){
        System.out.println("Método visualização");
    }

    @Deprecated
    void exibir() {
        System.out.println("Mostrando que o método exibir é deprecated");
    } 
}
