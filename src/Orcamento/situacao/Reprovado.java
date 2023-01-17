package Orcamento.situacao;

import Orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
