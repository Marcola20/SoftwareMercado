package br.edu.up.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cpf;
	private String matricula;
	private String nome;
	private String sobrenome;
	private String email;
	private String funcao;
	private String complemento;
	private String numero;
	private String rua;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;

	

	public Funcionario(String cpf, String matricula, String nome, String sobrenome, String email, String funcao,
			String complemento, String numero, String rua, String bairro, String cidade, String uf, String cep) {
		super();
		this.cpf = cpf;
		this.matricula = matricula;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.funcao = funcao;
		this.complemento = complemento;
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public Funcionario() {
	}

	@Override
	public String toString() {
		return "\nCPF: " + cpf + "\nNome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nMatricula: " + matricula + "\nEmail: " + email
				+ "\nFunção: " + funcao + "\nComplemento: " + complemento + "\nNumero: " + numero 
				+ "\nRua: " + rua + "\nBairro: " + bairro + "\nCidade: " + cidade 
				+ "\nUF: " + uf + "\nCEP: " + cep ;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	
}
