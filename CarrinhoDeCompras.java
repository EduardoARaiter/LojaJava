import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().equals(produto)) {
                item.aumentarQuantidade(quantidade);
                return;
            }
        }
        itens.add(new ItemCarrinho(produto, quantidade));
    }

    public BigDecimal calcularTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (ItemCarrinho item : itens) {
            total = total.add(item.calcularSubtotal());
        }
        return total;
    }

    public void imprimirCarrinho() {
        System.out.println("SEU CARRINHO ESTÁ ASSIM:\n");
        for (ItemCarrinho item : itens) {
            System.out.println(item.getProduto().getNome() + "\nQUANTIDADE: " + item.getQuantidade()
                    + "\nSUBTOTAL: R$" + item.calcularSubtotal());
        }
        System.out.println("\nTOTAL A SER PAGO: R$" + calcularTotal());
    }
}
