package tests.SolicitacaoDeMateriais;

import org.junit.jupiter.api.Test;
import src.Entitie.ListaDeMateriaisEntity;
import src.Usercase.SolicitacaoDeMateriais.ListaDeMateriais;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ListaDeMateriaisTest {
    public ListaDeMateriaisEntity listaDeMateriaisEntity;
    public ListaDeMateriais listaDeMateriais;

    @Test
    public void testeSeECriadoUmObjetoListaDeMateriais() {
        this.listaDeMateriaisEntity = new ListaDeMateriaisEntity();
        this.listaDeMateriais = new ListaDeMateriais();

        assertEquals(ListaDeMateriais.class, this.listaDeMateriais.getClass());
    }

    @Test
    public void testeSeECriadoUmaListaDeMateriais() {
        String id = UUID.randomUUID().toString();
        int quantidade = 4;
        String produto = "Novo Produto";
        this.listaDeMateriaisEntity = new ListaDeMateriaisEntity();
        this.listaDeMateriaisEntity.setId(id);
        this.listaDeMateriaisEntity.setQuantidade(quantidade);
        this.listaDeMateriaisEntity.setProduto(produto);
        this.listaDeMateriais = new ListaDeMateriais();

        this.listaDeMateriais.addMateriais(this.listaDeMateriaisEntity);
        ArrayList<ListaDeMateriaisEntity> arrayList;
        arrayList = this.listaDeMateriais.pegarListaDeMateriais();

        assertEquals(ArrayList.class, arrayList.getClass());
    }
}