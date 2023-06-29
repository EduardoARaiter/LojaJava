import java.math.BigDecimal;

public enum Produto {
    CALCA("Calça", BigDecimal.valueOf(140)),
    CAMISETA("Camiseta", BigDecimal.valueOf(100)),
    CASACO("Casaco", BigDecimal.valueOf(200));

    private String nome;
    private BigDecimal preco;

    Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
