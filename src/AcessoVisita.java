
public class AcessoVisita implements EstrategiaAcesso {

    @Override
    public boolean autenticar(String nome, int apartamento, String senha) {

        return nome.equalsIgnoreCase("Carlos")
                && apartamento == 104
                && senha.equals("5678");
    }
}
