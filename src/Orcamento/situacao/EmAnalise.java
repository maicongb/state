package Orcamento.situacao;

import Orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }

    public void reprovado(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
}
