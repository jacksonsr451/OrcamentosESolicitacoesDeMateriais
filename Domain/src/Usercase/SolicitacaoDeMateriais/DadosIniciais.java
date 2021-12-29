package src.Usercase.SolicitacaoDeMateriais;

import src.Entitie.DadosIniciaisEntity;

public class DadosIniciais {
    private DadosIniciaisEntity dadosIniciaisEntity;

    public DadosIniciais(DadosIniciaisEntity dadosIniciaisEntity) {
        this.dadosIniciaisEntity = dadosIniciaisEntity;
    }

    public DadosIniciaisEntity pegarDadosIniciais() {
        return this.dadosIniciaisEntity;
    }
}
