package src.Usercase.SolicitacaoDeMateriais;

import src.Entitie.ListaDeMateriaisEntity;

public class ListaDeMateriais {
    private ListaDeMateriaisEntity listaDeMateriaisEntity;

    public ListaDeMateriais(ListaDeMateriaisEntity listaDeMateriaisEntity) {
        this.listaDeMateriaisEntity = listaDeMateriaisEntity;
    }

    public ListaDeMateriaisEntity pegarListaDeMateriais() {
        return this.listaDeMateriaisEntity;
    }
}
