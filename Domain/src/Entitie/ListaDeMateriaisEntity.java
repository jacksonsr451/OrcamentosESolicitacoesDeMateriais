package src.Entitie;

public class ListaDeMateriaisEntity {
    public String id;
    public int quantidade;
    public String produto;

    public ListaDeMateriaisEntity() {}

    public ListaDeMateriaisEntity(String id, int quantidade, String produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
