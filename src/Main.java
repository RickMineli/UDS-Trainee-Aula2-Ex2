public class Main {

    public static void main(String[] args) {
        Produto panela = new Produto("Panela",12.50);
        Produto frigideira = new Produto("Frigideira",15.20);
        Produto cumbuca = new Produto("Cumbuca",20.22);
        Produto colher = new Produto("Colher",4.00);
        Produto prato = new Produto("Prato",10.00);

        Pedido pedido1 = new Pedido();
        pedido1.adicionarProduto(panela);
        pedido1.adicionarProduto(frigideira);
        pedido1.adicionarProduto(cumbuca);
        pedido1.adicionarProduto(colher);
        pedido1.adicionarProduto(prato);

        System.out.println("Nome e preço dso produtos da lista: ");
        pedido1.getTodosProdutos();
        System.out.println("|-------------------|");
        System.out.println("Valor total dos pedidos: ");
        System.out.println(pedido1.calcularTotal());
    }
}
