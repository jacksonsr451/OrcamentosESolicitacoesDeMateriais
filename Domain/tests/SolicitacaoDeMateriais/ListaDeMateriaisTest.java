package tests.SolicitacaoDeMateriais;

import org.junit.jupiter.api.Test;
import src.Entitie.ListaDeMateriaisEntity;
import src.Usercase.SolicitacaoDeMateriais.ListaDeMateriais;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ListaDeMateriaisTest {
    public ListaDeMateriaisEntity listaDeMateriaisEntity = new ListaDeMateriaisEntity();
    public ListaDeMateriaisEntity novaLista = new ListaDeMateriaisEntity();
    public ListaDeMateriais listaDeMateriais;
    public ArrayList<ListaDeMateriaisEntity> arrayList;
    public String id = UUID.randomUUID().toString();
    public int quantidade = 4;
    public String produto = "Novo Produto";
    public String novoID = UUID.randomUUID().toString();
    public String novoProduto = "Outro";
    public int novaQuantidade = 20;

    public ListaDeMateriaisTest() {
        this.listaDeMateriaisEntity.setId(this.id);
        this.listaDeMateriaisEntity.setQuantidade(this.quantidade);
        this.listaDeMateriaisEntity.setProduto(this.produto);
        this.listaDeMateriais = new ListaDeMateriais();
        this.listaDeMateriais.addMateriais(this.listaDeMateriaisEntity);
        this.novaLista.setId(novoID);
        this.novaLista.setProduto(novoProduto);
        this.novaLista.setQuantidade(novaQuantidade);
        this.listaDeMateriais.addMateriais(novaLista);
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

        assertEquals(this.id, this.arrayList.get(0).getId());
        assertEquals(this.quantidade, this.arrayList.get(0).getQuantidade());
        assertEquals(this.produto, this.arrayList.get(0).getProduto());
    }

    @Test
    public void testeSeListaDeMateriaisEAtualizadaPeloIndiceAQuantidade() {
        this.quantidade = 5;
        this.listaDeMateriais.atualizarMateriais(0, this.quantidade);

        this.arrayList = this.listaDeMateriais.pegarListaDeMateriais();

        assertEquals(this.id, this.arrayList.get(0).getId());
        assertEquals(this.quantidade, this.arrayList.get(0).getQuantidade());
        assertEquals(this.produto, this.arrayList.get(0).getProduto());
    }

    @Test
    public void testeSeListaDeMateriaisEAtualizadaPeloIndiceOMaterial() {
        this.produto = "Produto Atualizado";
        this.listaDeMateriais.atualizarMateriais(0, this.produto);

        this.arrayList = this.listaDeMateriais.pegarListaDeMateriais();

        assertEquals(this.id, this.arrayList.get(0).getId());
        assertEquals(this.quantidade, this.arrayList.get(0).getQuantidade());
        assertEquals(this.produto, this.arrayList.get(0).getProduto());
    }

    @Test
    public void testeSeListaEstaNull() {
        assertThrows(NullPointerException.class, () -> {
            Optional<ListaDeMateriaisEntity> opt2 = this.arrayList.stream().findFirst();
            opt2.get();
        });
    }

    @Test
    public void testeSeEDeletadoItemDaListaDeMateriaisPeloIndice() {
        this.listaDeMateriais.removeProduto(0);

        assertEquals(this.novoID, this.listaDeMateriais.pegarListaDeMateriais().get(0).getId());
        assertEquals(this.novoProduto, this.listaDeMateriais.pegarListaDeMateriais().get(0).getProduto());
        assertEquals(this.novaQuantidade, this.listaDeMateriais.pegarListaDeMateriais().get(0).getQuantidade());
    }
}