package br.com.projeto.api.repositorio;

import br.com.projeto.api.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface Repositorio extends CrudRepository<Cliente, Long> {


}
