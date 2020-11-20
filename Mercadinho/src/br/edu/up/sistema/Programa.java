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
					System.out.println("Nome: " + produto.getDescricao() + "\nPreço: R$" + produto.getValorVenda());
				}
				break;

			case 2:

				// Menu Funcionário

				Impressora.imprimirMenuFuncionario();
				op = Leitor.lerOp(op);

				switch (op) {

				case 1:

					// Funcionário - Cliente

					Impressora.imprimirMenuCliente();
					op = Leitor.lerOp(op);
					ClienteDAO clienteDAO = new ClienteDAO();

					switch (op) {

					case 1:

						// Funcionário: Visualizar Clientes

						List<Cliente> listaDeClientes = clienteDAO.listar();
						System.out.println("\n==================== CLIENTES ====================");
						for (Cliente cliente : listaDeClientes) {
							System.out.println(cliente);
						}
						break;

					case 2:

						// Funcionário: Atualizar Cliente

						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAtualizarCliente();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Cliente clienteAtualizar = new Cliente(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4]);
						clienteDAO.atualizar(clienteAtualizar);
						break;

					case 3:

						// Funcionário: Adicionar Cliente

						String[] vetorAdd = null;
						Impressora.imprimirMenuAddCliente();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Cliente clienteAdd = new Cliente(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3],
								vetorAdd[4]);
						clienteDAO.salvar(clienteAdd);
						break;

					case 4:

						// Funcionário: Apagar Cliente

						String[] vetorApagar = null;
						Impressora.imprimirMenuApagarCliente();
						vetorApagar = Leitor.lerDados(vetorApagar);
						clienteDAO.apagar(vetorApagar[0]);
						break;

					}
					break;

				case 2:

					// Funcionário - Produtos

					Impressora.imprimirMenuProduto();
					op = Leitor.lerOp(op);
					ProdutoDAO produtoDAO = new ProdutoDAO();

					switch (op) {

					case 1:

						// Funcionário: Visualizar Produtos

						List<Produto> listaDeProdutos = produtoDAO.listar();
						System.out.println("\n==================== Produtos ====================");
						for (Produto produto : listaDeProdutos) {
							System.out.println(produto);
						}

						break;
					case 2:

						// Funcionário: Atualizar Produtos

						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAddProduto();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Produto produtoAtualizar = new Produto(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4], vetorAtualizar[5], vetorAtualizar[6],
								vetorAtualizar[7]);
						produtoDAO.atualizar(produtoAtualizar);

						break;
					case 3:

						// Funcionário: Adicionar Produtos

						String[] vetorAdd = null;
						Impressora.imprimirMenuAddProduto();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Produto produtoAdd = new Produto(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3],
								vetorAdd[4], vetorAdd[5], vetorAdd[6], vetorAdd[7]);
						produtoDAO.salvar(produtoAdd);

						break;
					case 4:

						// Funcionário: Apagar Produtos
						String[] vetorApagar = null;
						Impressora.imprimirMenuAddProduto();
						vetorApagar = Leitor.lerDados(vetorApagar);
						produtoDAO.apagar(vetorApagar[0]);
						break;
					}
					break;

				case 3:

					// Funcionário - Fornecedores

					Impressora.imprimirMenuFornecedor();
					op = Leitor.lerOp(op);
					FornecedorDAO fornecedorDAO = new FornecedorDAO();

					switch (op) {

					case 1:

						// Funcionário: Visualizar Fornecedores
						List<Fornecedor> listaDeFornecedores = fornecedorDAO.listar();
						System.out.println("\n==================== Fornecedores ====================");
						for (Fornecedor fornecedor : listaDeFornecedores) {
							System.out.println(fornecedor);
						}
						break;
					case 2:

						// Funcionário: Atualizar Fornecedores
						
						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAtualizarFornecedor();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Fornecedor fornecedorAtualizar = new Fornecedor(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4], vetorAtualizar[5]);
						fornecedorDAO.atualizar(fornecedorAtualizar);
						break;
					case 3:

						// Funcionário: Adicionar Fornecedores
						break;
					case 4:

						// Funcionário: Apagar Fornecedores
						break;
					}
					break;
				}
				break;

			case 3:

				// Menu Proprietário

				Impressora.imprimirMenuProprietario();
				op=Leitor.lerOp(op);
				
				
				switch (op) {

				case 1:

					// Proprietário - Cliente
					Impressora.imprimirMenuCliente();
					op=Leitor.lerOp(op);
					ClienteDAO clienteDAO = new ClienteDAO();

					switch (op) {

					case 1:

						// Proprietário: Visualizar Clientes
						
						List<Cliente> listaDeClientes = clienteDAO.listar();
						System.out.println("\n==================== CLIENTES ====================");
						for (Cliente cliente : listaDeClientes) {
							System.out.println(cliente);
						}
			
						break;
					case 2:

						// Proprietário: Atualizar Cliente
						
						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAtualizarCliente();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Cliente clienteAtualizar = new Cliente(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4]);
						clienteDAO.atualizar(clienteAtualizar);
						break;
					case 3:

						// Proprietário: Adicionar Cliente
						
						String[] vetorAdd = null;
						Impressora.imprimirMenuAddCliente();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Cliente clienteAdd = new Cliente(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3],
								vetorAdd[4]);
						clienteDAO.salvar(clienteAdd);
						break;
					case 4:

						// Proprietário: Apagar Cliente
						
						String[] vetorApagar = null;
						Impressora.imprimirMenuApagarCliente();
						vetorApagar = Leitor.lerDados(vetorApagar);
						clienteDAO.apagar(vetorApagar[0]);
						break;
					}
					break;
				case 2:

					// Prorpietário - Produtos
					
					Impressora.imprimirMenuProduto();
					op=Leitor.lerOp(op);
					ProdutoDAO produtoDAO = new ProdutoDAO();

					switch (op) {

					case 1:

						// Proprietário: Visualizar Produtos
						
						List<Produto> listaDeProdutos = produtoDAO.listar();
						System.out.println("\n==================== Produtos ====================");
						for (Produto produto : listaDeProdutos) {
							System.out.println(produto);
						}
						break;
					case 2:

						// Proprietário: Atualizar Produtos
						
						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAddProduto();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Produto produtoAtualizar = new Produto(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4], vetorAtualizar[5], vetorAtualizar[6],
								vetorAtualizar[7]);
						produtoDAO.atualizar(produtoAtualizar);
						break;
					case 3:

						// Proprietário: Adicionar Produtos
						
						String[] vetorAdd = null;
						Impressora.imprimirMenuAddProduto();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Produto produtoAdd = new Produto(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3],
								vetorAdd[4], vetorAdd[5], vetorAdd[6], vetorAdd[7]);
						produtoDAO.salvar(produtoAdd);
						break;
					case 4:

						// Proprietário: Apagar Produtos
						
						String[] vetorApagar = null;
						Impressora.imprimirMenuAddProduto();
						vetorApagar = Leitor.lerDados(vetorApagar);
						produtoDAO.apagar(vetorApagar[0]);
						break;
					}
					break;
				case 3:

					// Proprietário - Fornecedores
					
					Impressora.imprimirMenuFornecedor();
					op=Leitor.lerOp(op);
					FornecedorDAO fornecedorDAO = new FornecedorDAO();

					switch (op) {

					case 1:

						// Proprietário: Visualizar Fornecedores
						
						List<Fornecedor> listaDeFornecedores = fornecedorDAO.listar();
						System.out.println("\n==================== Fornecedores ====================");
						for (Fornecedor fornecedor : listaDeFornecedores) {
							System.out.println(fornecedor);
						}
						break;
					case 2:

						// Proprietário: Atualizar Fornecedores
						
						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAtualizarFornecedor();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Fornecedor fornecedorAtualizar = new Fornecedor(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4], vetorAtualizar[5]);
						fornecedorDAO.atualizar(fornecedorAtualizar);
						break;
					case 3:

						// Proprietário: Adicionar Fornecedores
						
						String[] vetorAdd = null;
						Impressora.imprimirMenuAddFornecedor();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Fornecedor fornecedorAdd = new Fornecedor(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3],
								vetorAdd[4], vetorAdd[5]);
						fornecedorDAO.salvar(fornecedorAdd);
						break;
					case 4:

						// Proprietário: Apagar Fornecedores
						
						String[] vetorApagar = null;
						Impressora.imprimirMenuApagarFornecedor();
						vetorApagar = Leitor.lerDados(vetorApagar);
						fornecedorDAO.apagar(vetorApagar[0]);
						break;
					}

				case 4:

					// Proprietário - Funcionários
					
					Impressora.imprimirMenuFuncionario();
					op=Leitor.lerOp(op);
					FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
					switch (op) {

					case 1:

						// Proprietário: Visualizar Funcionários
						
						List<Funcionario> listaDeFuncionarios = funcionarioDAO.listar();
						System.out.println("\n==================== Funcionários ====================");
						for (Funcionario funcionario : listaDeFuncionarios) {
							System.out.println(funcionario);
						}
						break;
					case 2:

						// Proprietário: Atualizar Funcionários
						
						String[] vetorAtualizar = null;
						Impressora.imprimirMenuAtualizarFuncionario();
						vetorAtualizar = Leitor.lerDados(vetorAtualizar);
						Funcionario funcionarioAtualizar = new Funcionario(vetorAtualizar[0], vetorAtualizar[1], vetorAtualizar[2],
								vetorAtualizar[3], vetorAtualizar[4], vetorAtualizar[5], vetorAtualizar[6], vetorAtualizar[7], vetorAtualizar[8],
								vetorAtualizar[9], vetorAtualizar[10], vetorAtualizar[11], vetorAtualizar[12]);
						funcionarioDAO.atualizar(funcionarioAtualizar);
						break;
					case 3:

						// Proprietário: Adicionar Funcionários
						
						String[] vetorAdd = null;
						Impressora.imprimirMenuAddFuncionario();
						vetorAdd = Leitor.lerDados(vetorAdd);
						Funcionario funcionarioAdd = new Funcionario(vetorAdd[0], vetorAdd[1], vetorAdd[2], vetorAdd[3], vetorAdd[4], vetorAdd[5], vetorAdd[6],
								vetorAdd[7], vetorAdd[8],vetorAdd[9], vetorAdd[10], vetorAdd[11], vetorAdd[12]);
						funcionarioDAO.salvar(funcionarioAdd);
						break;
					case 4:

						// Proprietário: Apagar Funcionários
						
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