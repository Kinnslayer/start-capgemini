public class Principal {
    public static void main(String[] args) throws Exception {
       
        Pessoa pes = new Pessoa();
        pes.nomePessoa = "João do Nascimento";
        pes.idadePessoa = 15;
        pes.mostraDados(pes.nomePessoa, pes.idadePessoa);

    }
}
