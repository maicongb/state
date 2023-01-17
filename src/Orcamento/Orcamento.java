package Orcamento;

import Orcamento.situacao.EmAnalise;
import Orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItem;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItem) {
        this.valor = valor;
        this.quantidadeItem = quantidadeItem;
        this.situacao = new EmAnalise();
    }

    public void aplicarDesconto() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
