package br.com.fiap.Theocash.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Cliente {
    private Long clienteId;
    private String name;
    private String CPF;
    private Date dt_nasc;
    private String email;
    private String senha;

}