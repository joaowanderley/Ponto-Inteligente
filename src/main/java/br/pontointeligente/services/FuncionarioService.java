package br.pontointeligente.services;

import java.util.Optional;

import br.pontointeligente.model.Funcionario;

public interface FuncionarioService {

	/**
	 * persiste um funcionario na base de dados.
	 * 
	 * @param funcionario
	 * @return Funcionario
	 * */
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Busca e retorna um funcionario dado um CPF
	 * 
	 * @param cpf
	 * @return Optional<Funcionario>
	 * */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca e retorna um funcionario dado um email.
	 * 
	 * @param email
	 * @return Optional <Funcionario>
	 * */
Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Busca e retorna um funcionário por ID.
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorId(Long id);

}
