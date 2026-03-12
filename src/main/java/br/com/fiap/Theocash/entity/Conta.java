package br.com.fiap.Theocash.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

@Data
public class Conta {
    private Long ContaId;
    private String numeroConta;
    private int agenciaConta;
    private BigDecimal saldoConta;
    private String statusConta;
    private Date dataCriacaoConta;

    //todo: relacionar a cliente

    public void depositar() {

    }

    public void sacar() {

    }

    public BigDecimal consultarSaldo() {
        return saldoConta;
    }

    //todo: implementar obterExtrato() -> arrayList, creio
}
