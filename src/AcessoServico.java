
public class AcessoServico implements EstrategiaAcesso {

    @Override
    public boolean autenticar(String nome, int apartamento, String senha) {

        return nome.equalsIgnoreCase("Roberto")
                && apartamento == 104
                && senha.equals("9012");
    }
}
