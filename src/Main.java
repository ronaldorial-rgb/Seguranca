

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE SEGURANCA ===");
        System.out.println("1 - Morador");
        System.out.println("2 - Visitante");
        System.out.println("3 - Prestador de servico");
        System.out.print("Escolha o tipo de acesso: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        EstrategiaAcesso estrategia;

        switch (opcao) {
            case 1:
                estrategia = new AcessoMorador();
                break;
            case 2:
                estrategia = new AcessoVisita();
                break;
            case 3:
                estrategia = new AcessoServico();
                break;
            default:
                System.out.println("Opcao invalida.");
                scanner.close();
                return;
        }

        int tentativas = 0;
        boolean autorizado = false;

        while (tentativas < 3 && !autorizado) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Apartamento: ");
            int apartamento = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            autorizado = estrategia.autenticar(nome, apartamento, senha);

            if (autorizado) {
                System.out.println("Acesso autorizado.");
            } else {
                tentativas++;
                System.out.println("Acesso negado. Dados invalidos.");

                if (tentativas < 3) {
                    System.out.println("Tentativas restantes: "
                            + (3 - tentativas));
                }
            }
        }

        if (!autorizado) {
            System.out.println("ACESSO BLOQUEADO.");
            System.out.println(
                    "Simulacao: seguranca central notificada.");
        }

        scanner.close();
    }
}
