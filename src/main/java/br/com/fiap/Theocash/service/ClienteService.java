package br.com.fiap.Theocash.service;
import br.com.fiap.Theocash.entity.Cliente;
import br.com.fiap.Theocash.entity.Conta;

public class ClienteService {
    public void criarConta(Conta novaConta) {
        novaConta.setCliente(this);
    }

    public void login() {
        // TODO: implementar login
    }
}
