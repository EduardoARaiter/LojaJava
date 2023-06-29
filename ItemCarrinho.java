import java.math.BigDecimal;

public class ItemCarrinho {
    private Produto produto;
    private int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void aumentarQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Quantidade inválida. A quantidade deve ser maior que zero.");
        }
    }

    public BigDecimal calcularSubtotal() {
        return produto.getPreco().multiply(BigDecimal.valueOf(quantidade));
    }
}
