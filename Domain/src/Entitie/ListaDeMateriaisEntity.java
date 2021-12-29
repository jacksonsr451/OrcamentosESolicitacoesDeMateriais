package src.Entitie;

public class ListaDeMateriaisEntity {
    public int id;
    public int quantidade;
    public String produto;

    public ListaDeMateriaisEntity() {}

    public ListaDeMateriaisEntity(int id, int quantidade, String produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
