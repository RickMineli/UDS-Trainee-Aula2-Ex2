public class Produto {
    private String nomeProduto;
    private Double valorProduto;

    public Produto(String nomeProduto, Double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }
}
