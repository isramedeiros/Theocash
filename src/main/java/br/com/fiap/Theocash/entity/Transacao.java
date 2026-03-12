package br.com.fiap.Theocash.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Transacao {
    private String TransacaoId;
    private String tipoTransacao;
    private BigDecimal valorTransacao;
    private Date dataHoraTransacao;
    private String statusTransacao;
}
