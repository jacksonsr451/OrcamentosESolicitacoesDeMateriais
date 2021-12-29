package tests.SolicitacaoDeMateriais;

import org.junit.jupiter.api.Test;
import src.Entitie.DadosIniciaisEntity;
import src.Usercase.SolicitacaoDeMateriais.DadosIniciais;

import java.util.Date;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class DadosIniciaisTest {
    public DadosIniciais dadosIniciais;
    public DadosIniciaisEntity dadosIniciaisEntity;

    @Test
    public void testeSeAClaseDadosIniciaisExiste() {
        this.dadosIniciaisEntity = new DadosIniciaisEntity();
        this.dadosIniciais = new DadosIniciais(this.dadosIniciaisEntity);
        assertEquals(DadosIniciais.class, this.dadosIniciais.getClass());
    }

    @Test
    public void testeSeRetornaDadosIniciais() {
        this.dadosIniciaisEntity = new DadosIniciaisEntity();
        String id = UUID.randomUUID().toString();
        String empresa = "Teste";
        String local = "Jacarezinho";
        Date data = new Date();
        String cnpj = "00.000.000/0000-00";
        this.dadosIniciaisEntity.setId(id);
        this.dadosIniciaisEntity.setEmpressa(empresa);
        this.dadosIniciaisEntity.setLocal(local);
        this.dadosIniciaisEntity.setData(data);
        this.dadosIniciaisEntity.setCnpj(cnpj);
        this.dadosIniciais = new DadosIniciais(this.dadosIniciaisEntity);

        DadosIniciaisEntity novoValor = this.dadosIniciais.pegarDadosIniciais();

        assertEquals(id, novoValor.getId());
        assertEquals(empresa, novoValor.getEmpressa());
        assertEquals(local, novoValor.getLocal());
        assertEquals(data, novoValor.getData());
        assertEquals(cnpj, novoValor.getCnpj());
    }
}