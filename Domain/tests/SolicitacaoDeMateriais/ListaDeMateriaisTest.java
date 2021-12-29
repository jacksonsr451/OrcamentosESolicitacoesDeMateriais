package tests.SolicitacaoDeMateriais;

import org.junit.jupiter.api.Test;
import src.Entitie.ListaDeMateriaisEntity;
import src.Usercase.SolicitacaoDeMateriais.ListaDeMateriais;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ListaDeMateriaisTest {
    public ListaDeMateriaisEntity listaDeMateriaisEntity = new ListaDeMateriaisEntity();
    public ListaDeMateriais listaDeMateriais;
    public ArrayList<ListaDeMateriaisEntity> arrayList;
    public String id = UUID.randomUUID().toString();
    public int quantidade = 4;
    public String produto = "Novo Produto";

    public ListaDeMateriaisTest() {
        this.listaDeMateriaisEntity.setId(this.id);
        this.listaDeMateriaisEntity.setQuantidade(this.quantidade);
        this.listaDeMateriaisEntity.setProduto(this.produto);
        this.listaDeMateriais = new ListaDeMateriais();
        this.listaDeMateriais.addMateriais(this.listaDeMateriaisEntity);
    }

    @Test
    public void testeSeECriadoUmObjetoListaDeMateriais() {
        assertEquals(ListaDeMateriais.class, this.listaDeMateriais.getClass());
    }

    @Test
    public void testeSeECriadoUmaListaDeMateriais() {
        this.arrayList = this.listaDeMateriais.pegarListaDeMateriais();

        assertEquals(ArrayList.class, this.arrayList.getClass());
    }

    @Test
    public void testeSeListaDeMateriaisContemOsItensAdcionados() {
        this.arrayList = this.listaDeMateriais.pegarListaDeMateriais();

        assertEquals(id, this.arrayList.get(0).getId());
        assertEquals(quantidade, this.arrayList.get(0).getQuantidade());
        assertEquals(produto, this.arrayList.get(0).getProduto());
    }

//    @Test
//    public void testeSeListaDeMateriaisEAtualizadaPeloIndice() {
//        this.arrayList = this.listaDeMateriais.pegarListaDeMateriais();
//
//        assertEquals(id, this.arrayList.get(0).getId());
//        assertEquals(quantidade, this.arrayList.get(0).getQuantidade());
//        assertEquals(produto, this.arrayList.get(0).getProduto());
//    }
}