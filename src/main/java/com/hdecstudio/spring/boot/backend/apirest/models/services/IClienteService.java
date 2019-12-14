package com.hdecstudio.spring.boot.backend.apirest.models.services;

import java.util.List;

import com.hdecstudio.spring.boot.backend.apirest.model.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public Cliente findById(Long id);
	public Cliente save(Cliente cliente);
	public void delete(Long id);
}
