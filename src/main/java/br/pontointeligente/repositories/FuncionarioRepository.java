package br.pontointeligente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.pontointeligente.model.Funcionario;

@Transactional(readOnly = true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	
	// metodos reconhecidos exclusivamente pelo Spring
		Funcionario findByCpf(String cpf);
		
		Funcionario findByEmail(String email);
		
		Funcionario findByCpfOrEmail(String cpf, String email);
}
