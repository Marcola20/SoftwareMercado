package br.edu.up.sistema;

import java.util.List;
import java.util.Scanner;

import br.edu.up.dao.ClienteDAO;
import br.edu.up.dao.FornecedorDAO;
import br.edu.up.dao.FuncionarioDAO;
import br.edu.up.dao.ProdutoDAO;
import br.edu.up.model.Cliente;
import br.edu.up.model.Fornecedor;
import br.edu.up.model.Funcionario;
import br.edu.up.model.Produto;
import br.edu.up.others.Impressora;
import br.edu.up.others.Leitor;

public class Programa {

	public static void main(String[] args) {

		int op = 0;

		while (op != 10) {

			// Menu Inicial

			Impressora.imprimirMenuInicial();
			op = Leitor.lerOp(op);

			switch (op) {

			case 1:

				// Menu Clientes
				Impressora.imprimirMenuDoCliente();
				ProdutoDAO produto1DAO = new ProdutoDAO();
				List<Produto> listaDeProdutos1 = produto1DAO.listar();
				System.out.println("\n==================== Produtos ====================");
				for (Produto produto : listaDeProdutos1) {
					System.out.println("Nome: " + produto.getDescricao() + "\nPre�o: R$" + produto.getValorVenda());
				}
				break;

			case 2:

				// Menu Funcion�rio

				Impressora.imprimirMenuFuncionario();
				op = Leitor.lerOp(op);

				switch (op) {

				case 1:

					// Funcion�rio - Cliente

					Impressora.imprimirMenuCliente();
					op = Leitor.lerOp(op);
					ClienteDAO clienteDAO = new ClienteDAO();

					switch (op) {

					case 1:

						// Funcion�rio: Visualizar Clientes

						List<Cliente> listaDeClientes = clienteDAO.listar();
						System.out.println("\n==================== CLIENTES ====================");
						for (Cliente cliente : listaDeClientes) {
							System.out.println(cliente);
						}
						break;

					case 2:

						// Funcion�rio: Atualizar Cliente

						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAtualizarCliente();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Cliente clienteAtualizar = new Cliente(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4]);
						clienteDAO.atualizar(clienteAtualizar);
						break;

					case 3:

						// Funcion�rio: Adicionar Cliente

						String[] vetorAdd = null;
						Impressora.imprimirMenuAddCliente();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Cliente clienteAdd = new Cliente(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3],
								vetorAdd[4]);
						clienteDAO.salvar(clienteAdd);
						break;

					case 4:

						// Funcion�rio: Apagar Cliente

						String[] vetorApagar = null;
						Impressora.imprimirMenuApagarCliente();
						vetorApagar = Leitor.lerDados(vetorApagar);
						clienteDAO.apagar(vetorApagar[0]);
						break;

					}
					break;

				case 2:

					// Funcion�rio - Produtos

					Impressora.imprimirMenuProduto();
					op = Leitor.lerOp(op);
					ProdutoDAO produtoDAO = new ProdutoDAO();

					switch (op) {

					case 1:

						// Funcion�rio: Visualizar Produtos

						List<Produto> listaDeProdutos = produtoDAO.listar();
						System.out.println("\n==================== Produtos ====================");
						for (Produto produto : listaDeProdutos) {
							System.out.println(produto);
						}

						break;
					case 2:

						// Funcion�rio: Atualizar Produtos

						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAddProduto();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Produto produtoAtualizar = new Produto(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4], vetorAtualizar[5], vetorAtualizar[6],
								vetorAtualizar[7]);
						produtoDAO.atualizar(produtoAtualizar);

						break;
					case 3:

						// Funcion�rio: Adicionar Produtos

						String[] vetorAdd = null;
						Impressora.imprimirMenuAddProduto();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Produto produtoAdd = new Produto(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3],
								vetorAdd[4], vetorAdd[5], vetorAdd[6], vetorAdd[7]);
						produtoDAO.salvar(produtoAdd);

						break;
					case 4:

						// Funcion�rio: Apagar Produtos
						String[] vetorApagar = null;
						Impressora.imprimirMenuAddProduto();
						vetorApagar = Leitor.lerDados(vetorApagar);
						produtoDAO.apagar(vetorApagar[0]);
						break;
					}
					break;

				case 3:

					// Funcion�rio - Fornecedores

					Impressora.imprimirMenuFornecedor();
					op = Leitor.lerOp(op);
					FornecedorDAO fornecedorDAO = new FornecedorDAO();

					switch (op) {

					case 1:

						// Funcion�rio: Visualizar Fornecedores
						List<Fornecedor> listaDeFornecedores = fornecedorDAO.listar();
						System.out.println("\n==================== Fornecedores ====================");
						for (Fornecedor fornecedor : listaDeFornecedores) {
							System.out.println(fornecedor);
						}
						break;
					case 2:

						// Funcion�rio: Atualizar Fornecedores
						
						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAtualizarFornecedor();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Fornecedor fornecedorAtualizar = new Fornecedor(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4], vetorAtualizar[5]);
						fornecedorDAO.atualizar(fornecedorAtualizar);
						break;
					case 3:

						// Funcion�rio: Adicionar Fornecedores
						break;
					case 4:

						// Funcion�rio: Apagar Fornecedores
						break;
					}
					break;
				}
				break;

			case 3:

				// Menu Propriet�rio

				Impressora.imprimirMenuProprietario();
				op=Leitor.lerOp(op);
				
				
				switch (op) {

				case 1:

					// Propriet�rio - Cliente
					Impressora.imprimirMenuCliente();
					op=Leitor.lerOp(op);
					ClienteDAO clienteDAO = new ClienteDAO();

					switch (op) {

					case 1:

						// Propriet�rio: Visualizar Clientes
						
						List<Cliente> listaDeClientes = clienteDAO.listar();
						System.out.println("\n==================== CLIENTES ====================");
						for (Cliente cliente : listaDeClientes) {
							System.out.println(cliente);
						}
			
						break;
					case 2:

						// Propriet�rio: Atualizar Cliente
						
						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAtualizarCliente();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Cliente clienteAtualizar = new Cliente(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4]);
						clienteDAO.atualizar(clienteAtualizar);
						break;
					case 3:

						// Propriet�rio: Adicionar Cliente
						
						String[] vetorAdd = null;
						Impressora.imprimirMenuAddCliente();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Cliente clienteAdd = new Cliente(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3],
								vetorAdd[4]);
						clienteDAO.salvar(clienteAdd);
						break;
					case 4:

						// Propriet�rio: Apagar Cliente
						
						String[] vetorApagar = null;
						Impressora.imprimirMenuApagarCliente();
						vetorApagar = Leitor.lerDados(vetorApagar);
						clienteDAO.apagar(vetorApagar[0]);
						break;
					}
					break;
				case 2:

					// Prorpiet�rio - Produtos
					
					Impressora.imprimirMenuProduto();
					op=Leitor.lerOp(op);
					ProdutoDAO produtoDAO = new ProdutoDAO();

					switch (op) {

					case 1:

						// Propriet�rio: Visualizar Produtos
						
						List<Produto> listaDeProdutos = produtoDAO.listar();
						System.out.println("\n==================== Produtos ====================");
						for (Produto produto : listaDeProdutos) {
							System.out.println(produto);
						}
						break;
					case 2:

						// Propriet�rio: Atualizar Produtos
						
						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAddProduto();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Produto produtoAtualizar = new Produto(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4], vetorAtualizar[5], vetorAtualizar[6],
								vetorAtualizar[7]);
						produtoDAO.atualizar(produtoAtualizar);
						break;
					case 3:

						// Propriet�rio: Adicionar Produtos
						
						String[] vetorAdd = null;
						Impressora.imprimirMenuAddProduto();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Produto produtoAdd = new Produto(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3],
								vetorAdd[4], vetorAdd[5], vetorAdd[6], vetorAdd[7]);
						produtoDAO.salvar(produtoAdd);
						break;
					case 4:

						// Propriet�rio: Apagar Produtos
						
						String[] vetorApagar = null;
						Impressora.imprimirMenuAddProduto();
						vetorApagar = Leitor.lerDados(vetorApagar);
						produtoDAO.apagar(vetorApagar[0]);
						break;
					}
					break;
				case 3:

					// Propriet�rio - Fornecedores
					
					Impressora.imprimirMenuFornecedor();
					op=Leitor.lerOp(op);
					FornecedorDAO fornecedorDAO = new FornecedorDAO();

					switch (op) {

					case 1:

						// Propriet�rio: Visualizar Fornecedores
						
						List<Fornecedor> listaDeFornecedores = fornecedorDAO.listar();
						System.out.println("\n==================== Fornecedores ====================");
						for (Fornecedor fornecedor : listaDeFornecedores) {
							System.out.println(fornecedor);
						}
						break;
					case 2:

						// Propriet�rio: Atualizar Fornecedores
						
						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAtualizarFornecedor();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Fornecedor fornecedorAtualizar = new Fornecedor(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4], vetorAtualizar[5]);
						fornecedorDAO.atualizar(fornecedorAtualizar);
						break;
					case 3:

						// Propriet�rio: Adicionar Fornecedores
						
						String[] vetorAdd = null;
						Impressora.imprimirMenuAddFornecedor();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Fornecedor fornecedorAdd = new Fornecedor(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3],
								vetorAdd[4], vetorAdd[5]);
						fornecedorDAO.salvar(fornecedorAdd);
						break;
					case 4:

						// Propriet�rio: Apagar Fornecedores
						
						String[] vetorApagar = null;
						Impressora.imprimirMenuApagarFornecedor();
						vetorApagar = Leitor.lerDados(vetorApagar);
						fornecedorDAO.apagar(vetorApagar[0]);
						break;
					}

				case 4:

					// Propriet�rio - Funcion�rios
					
					Impressora.imprimirMenuFuncionario();
					op=Leitor.lerOp(op);
					FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
					switch (op) {

					case 1:

						// Propriet�rio: Visualizar Funcion�rios
						
						List<Funcionario> listaDeFuncionarios = funcionarioDAO.listar();
						System.out.println("\n==================== Funcion�rios ====================");
						for (Funcionario funcionario : listaDeFuncionarios) {
							System.out.println(funcionario);
						}
						break;
					case 2:

						// Propriet�rio: Atualizar Funcion�rios
						
						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAtualizarFuncionario();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Funcionario funcionarioAtualizar = new Funcionario(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4], vetorAtualizar[5], vetorAtualizar[6], vetorAtualizar[7], vetorAtualizar[8],
								vetorAtualizar[9], vetorAtualizar[10], vetorAtualizar[11], vetorAtualizar[12]);
						funcionarioDAO.atualizar(funcionarioAtualizar);
						break;
					case 3:

						// Propriet�rio: Adicionar Funcion�rios
						
						String[] vetorAdd = null;
						Impressora.imprimirMenuAddFuncionario();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Funcionario funcionarioAdd = new Funcionario(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3], vetorAdd[4], vetorAdd[5], vetorAdd[6],
								vetorAdd[7], vetorAdd[8],vetorAdd[9], vetorAdd[10], vetorAdd[11], vetorAdd[12]);
						funcionarioDAO.salvar(funcionarioAdd);
						break;
					case 4:

						// Propriet�rio: Apagar Funcion�rios
						
						String[] vetorApagar = null;
						Impressora.imprimirMenuApagarFuncionario();
						vetorApagar = Leitor.lerDados(vetorApagar);
						funcionarioDAO.apagar(vetorApagar[0]);
						break;
					}
					break;
				}
				break;
			default:
			}
		}
	}
}