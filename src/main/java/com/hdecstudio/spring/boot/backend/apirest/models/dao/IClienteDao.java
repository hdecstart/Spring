package com.hdecstudio.spring.boot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.hdecstudio.spring.boot.backend.apirest.model.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
}
