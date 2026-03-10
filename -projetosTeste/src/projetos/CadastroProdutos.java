package projetos;

public class CadastroProdutos {
    
    private String nomeProd;
    private int preco, quant;

    public CadastroProdutos(String nome, int p, int q){
    }

    public int valorTotalEstoque(){
        return preco * quant;
    }

    public void inserirProdutos(int quantidade){
        this.quant += quantidade;
    }

    
    public void removerProdutos(int quantidade){
        this.quant -= quantidade;
    }
    
    public String getNomeProd() {
        return nomeProd;
    }
    
    public int getPreco() {
        return preco;
    }
    
    public int getQuant() {
        return quant;
    }
    
    @Override
    public String toString() {
        return "CadastroProdutos [nomeProd=" + nomeProd + ", preco=" + preco + ", quant=" + quant
                + ", valorTotalEstoque()=" + valorTotalEstoque() + "]";
    }
}