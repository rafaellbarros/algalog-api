package com.algaworks.algalog.controller;

import com.algaworks.algalog.domail.model.entity.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 17/05/2022
 */

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {

        final var cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Rafael Barros");
        cliente.setTelefone("61 99999-1111");
        cliente.setEmail("rafaelbarros@algaworks.com");

        final var cliente1 = new Cliente();
        cliente1.setId(2L);
        cliente1.setNome("Leandro Silva");
        cliente1.setTelefone("61 99999-1111");
        cliente1.setEmail("leandrosilva@algaworks.com");

        return Arrays.asList(cliente, cliente1);
    }

}
