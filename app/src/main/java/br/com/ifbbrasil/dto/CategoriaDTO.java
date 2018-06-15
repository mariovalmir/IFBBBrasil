package br.com.ifbbrasil.dto;

import java.io.Serializable;
import java.util.List;

public class CategoriaDTO implements Serializable{
    private List<String> divisoes;
    private List<String> pesosAltura;
    private List<String> posesCompulsorias;
    private List<String> criteriosDeAvaliacao;
    private List<String> vestimentas;

    public List<String> getDivisoes() {
        return divisoes;
    }

    public void setDivisoes(List<String> divisoes) {
        this.divisoes = divisoes;
    }

    public List<String> getPesosAltura() {
        return pesosAltura;
    }

    public void setPesosAltura(List<String> pesosAltura) {
        this.pesosAltura = pesosAltura;
    }

    public List<String> getPosesCompulsorias() {
        return posesCompulsorias;
    }

    public void setPosesCompulsorias(List<String> posesCompulsorias) {
        this.posesCompulsorias = posesCompulsorias;
    }

    public List<String> getCriteriosDeAvaliacao() {
        return criteriosDeAvaliacao;
    }

    public void setCriteriosDeAvaliacao(List<String> criteriosDeAvaliacao) {
        this.criteriosDeAvaliacao = criteriosDeAvaliacao;
    }

    public List<String> getVestimentas() {
        return vestimentas;
    }

    public void setVestimentas(List<String> vestimentas) {
        this.vestimentas = vestimentas;
    }
}
