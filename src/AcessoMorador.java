
public class AcessoMorador implements EstrategiaAcesso {

    @Override
    public boolean autenticar(String nome, int apartamento, String senha) {

        return nome.equalsIgnoreCase("Luciano")
                && apartamento == 104
                && senha.equals("1234");
    }
}
