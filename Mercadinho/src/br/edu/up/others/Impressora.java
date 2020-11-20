package br.edu.up.others;

public class Impressora {

	public static void imprimirMenuInicial() {

		System.out.println("\nSeja bem-vindo(a) ao Mercadinho Meio-sangue!");
		System.out.println("\nDiga-nos, o que voc� �?\n");
		System.out.println("0) Encerrar o programa");
		System.out.println("1) Sou um(a) CLIENTE");
		System.out.println("2) Sou um(a) FUNCION�RIO(A)");
		System.out.println("3) Sou um(a)/o(a) PROPRIET�RIO(A)");
		System.out.print("\nInsira a op��o adequada (1, 2 OU 3): ");
	}

	public static void imprimirMenuFuncionario() {

		System.out.println("\nOl�, funcion�rio!");
		System.out.println("\nDiga-nos, com qual entidade deseja interagir?\n");
		System.out.println("1) Clientes");
		System.out.println("2) Produtos");
		System.out.println("3) Fornecedores");
		System.out.print("\nInsira a op��o adequada: ");
	}

	public static void imprimirMenuCliente() {

		System.out.println("\nO que deseja realizar?\n");
		System.out.println("1) Ver todos os clientes");
		System.out.println("2) Atualizar Cliente");
		System.out.println("3) Adicionar Clientes");
		System.out.println("4) Apagar Clientes");
		System.out.print("\nInsira a op��o adequada: ");
	}

	public static void imprimirMenuProduto() {

		System.out.println("\nO que deseja realizar?\n");
		System.out.println("1) Ver todos os produtos");
		System.out.println("2) Atualizar um produto");
		System.out.println("3) Adicionar um roduto");
		System.out.println("4) Apagar um produto");
		System.out.print("\nInsira a op��o adequada: ");
	}

	public static void imprimirMenuFornecedor() {

		System.out.println("\nO que deseja realizar?\n");
		System.out.println("1) Ver todos os fornecedores");
		System.out.println("2) Atualizar um fornecedor");
		System.out.println("3) Adicionar um fornecedor");
		System.out.println("4) Apagar um fornecedor");
		System.out.print("\nInsira a op��o adequada: ");
	}

	public static void imprimirMenuProprietario() {

		System.out.println("\nOl� propriet�rio!\n");
		System.out.println("\nDiga-nos com qual entidade voc� deseja interagir\n");
		System.out.println("1) Clientes");
		System.out.println("2) Produtos");
		System.out.println("3) Fornecedores");
		System.out.println("4) Funcionários");
		System.out.print("\nInsira a op��o adequada: ");
	}
	
	public static void imprimirMenuDoCliente() {
		
		System.out.println("\nOl�, cliente. Confira nossa lista de produtos");
		
	}

	public static void imprimirMenuAtualizarCliente() {

		System.out.println(
				"\nInsira o CPF/CNPJ, Nome/Nome Fantasia, Sobrenome/Raz�o Social, Tipo de Pessoa e E-mail do cliente:\n");
	}

	public static void imprimirMenuAtualizarFornecedor() {

		System.out.println(
				"\nInsira o CPF/CNPJ, Nome/Nome Fantasia, Sobrenome/Raz�o Social, Tipo de Pessoa, Inscri��o Estadual e Inscri��o Municipal do fornecedor:");
	}
	
	public static void imprimirMenuAtualizarFuncionario() {

		System.out.println(
				"\nInsira o CPF, Matricula, Nome, Sobrenome, Email, Fun��o, Complemento, N�mero, Rua, Bairro, Cidade, UF, CEP do funcionario:");
	}

	public static void imprimirMenuAddCliente() {

		System.out.println(
				"\nInsira o CPF/CNPJ, Nome/Raz�o Social, Sobrenome/Nome Fantasia, Tipo de Pessoa e E-mail do novo cliente:\n");
	}

	public static void imprimirMenuAddProduto() {

		System.out.println(
				"\nInsira o SKU, EAN, Descri��o, Quantidade Total, Unidade, NCM, Custo e Valor de venda do produto:\n");
	}

	public static void imprimirMenuApagarCliente() {

		System.out.println("\nInsira o CPF/CNPJ do cliente que deseja apagar:\n");
	}
	
	public static void imprimirMenuApagarFornecedor() {

		System.out.println("\nInsira o CPF/CNPJ do fornecedor que deseja apagar:\n");
	}
	
	public static void imprimirMenuAddFornecedor() {

		System.out.println(
				"\nInsira o CPF/CNPJ, Nome/Nome Fantasia, Sobrenome/Raz�o Social, Tipo de Pessoa, Inscri��o Estadual e Inscri��o Municipal do fornecedor:\n");
	}
	
	public static void imprimirMenuAddFuncionario() {

		System.out.println(
				"\nInsira o CPF, Matricula, Nome, Sobrenome, Email, Fun��o, Complemento, N�mero, Rua, Bairro, Cidade, UF, CEP do funcionario:");
	}
	
	public static void imprimirMenuApagarFuncionario() {

		System.out.println("\nInsira a Matricula do funcion�rio que deseja apagar:\n");
	}
	
	
}