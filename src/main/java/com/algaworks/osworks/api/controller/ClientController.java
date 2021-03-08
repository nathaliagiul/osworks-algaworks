package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.algaworks.osworks.domain.model.*;
@RestController
public class ClientController {
	
	@GetMapping("/clientes")
	public List<Client> listar() {
		
		var cliente1 = new Client();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setEmail("João@gmail.com");
		cliente1.setTelefone("84 999999");
		
		var cliente2 = new Client();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setEmail("Maria@gmail.com");
		cliente2.setTelefone("84 999999");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
