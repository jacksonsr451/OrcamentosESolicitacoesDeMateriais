package src.Entitie;

import java.util.Date;
import java.util.UUID;

public class DadosIniciaisEntity {
    public String id;
    public String empressa;
    public String cnpj;
    public String local;
    public Date data;

    public DadosIniciaisEntity() {}

    public DadosIniciaisEntity(String id, String empressa, String cnpj, String local, Date data) {
        this.id = id;
        this.empressa = empressa;
        this.cnpj = cnpj;
        this.local = local;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpressa() {
        return empressa;
    }

    public void setEmpressa(String empressa) {
        this.empressa = empressa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
