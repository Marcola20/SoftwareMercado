package br.edu.up.dao;

import java.util.List;

public interface DAO<T> {

	List<T> listar();
	T salvar(T entidade);
	T atualizar(T entidade);
	void apagar(String id);
	T buscarPorId(String id);
}