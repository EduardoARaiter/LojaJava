import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        limparTela();

        Scanner scanner = new Scanner(System.in);
        System.out.print("--------------------------------------------");
        System.out.print("\n        SEJA BEM VINDO A LOJA VIRTUAL\n");
        System.out.print("--------------------------------------------");

        System.out.print("\nPressione Enter para continuar...\n");
        scanner.nextLine();
        limparTela();

        boolean continuar = true;

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        while (continuar) {
            System.out.println("ESTES SÃO OS PRODUTOS DISPONÍVEIS:");
            System.out.println("1 - Calça - R$" + Produto.CALCA.getPreco());
            System.out.println("2 - Camiseta - R$" + Produto.CAMISETA.getPreco());
            System.out.println("3 - Casaco - R$" + Produto.CASACO.getPreco());
            System.out.println("0 - FINALIZAR COMPRA\n");

            System.out.print("DIGITE O NÚMERO DO PRODUTO QUE DESEJA ADICIONAR AO SEU CARRINHO: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto(carrinho, Produto.CALCA, scanner);
                    break;
                case 2:
                    adicionarProduto(carrinho, Produto.CAMISETA, scanner);
                    break;
                case 3:
                    adicionarProduto(carrinho, Produto.CASACO, scanner);
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.print("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.\n");
            }

            limparTela();
            carrinho.imprimirCarrinho();

            System.out.print("\nPressione Enter para continuar...");
            scanner.nextLine();
            limparTela();
        }

        scanner.close();
    }

    private static void adicionarProduto(CarrinhoDeCompras carrinho, Produto produto, Scanner scanner) {
        System.out.print("DIGITE A QUANTIDADE DE " + produto.getNome().toUpperCase() + " QUE DESEJA ADICIONAR: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        carrinho.adicionarProduto(produto, quantidade);
        System.out.println(produto.getNome().toUpperCase() + " FOI ADICIONADA AO CARRINHO!");
    }

    private static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
