package br.com.edmar.dao.jpa;

import br.com.edmar.dao.generic.jpa.GenericJpaDAO;
import br.com.edmar.domain.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
