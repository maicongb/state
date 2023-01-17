import Orcamento.Orcamento;
import Orcamento.situacao.Aprovado;
import Orcamento.situacao.Reprovado;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
         Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 8);
         orcamento.setSituacao(new Aprovado());//muda o status
         orcamento.aplicarDesconto();
         System.out.println(orcamento);
    }
}