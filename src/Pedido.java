import java.util.ArrayList;

public class Pedido {
    private Double totalPedido = 0.0;
    private ArrayList<Produto> produtos = new ArrayList();

    public void adicionarProduto(Produto produtoNovo){
        this.produtos.add(produtoNovo);
    }

    public Double calcularTotal() {
        for (Produto produto : produtos) {
            this.totalPedido += produto.getValorProduto();
        }
        return this.totalPedido;
    }
    public Double getTotalPedido() {
        return totalPedido;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void getTodosProdutos(){
        for (Produto produto: produtos){
            System.out.println(produto.getNomeProduto());
            System.out.println(produto.getValorProduto());
        }
    }
}
