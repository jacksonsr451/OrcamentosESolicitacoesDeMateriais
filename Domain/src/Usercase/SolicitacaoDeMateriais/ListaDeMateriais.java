package src.Usercase.SolicitacaoDeMateriais;

import src.Entitie.ListaDeMateriaisEntity;

import java.util.ArrayList;

public class ListaDeMateriais {
    private ArrayList<ListaDeMateriaisEntity> listaDeMateriais;

    public ListaDeMateriais() {
        this.listaDeMateriais = new ArrayList<>();
    }

    public void addMateriais(ListaDeMateriaisEntity listaDeMateriaisEntity) {
        this.listaDeMateriais.add(listaDeMateriaisEntity);
    }

    public void atualizarMateriais(int indice, int quantidade) {
        this.listaDeMateriais.get(indice).setQuantidade(quantidade);
    }

    public ArrayList<ListaDeMateriaisEntity> pegarListaDeMateriais() {
        return this.listaDeMateriais;
    }
}
