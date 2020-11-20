package br.edu.up.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedores")
public class Fornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cpf_cnpj;

	private String nome_nomeFantasia;
	private String sobrenome_razaoSocial;
	private String tipoPessoa;
	private String inscEstadual;
	private String inscMunicipal;

	public Fornecedor(String cpf_cnpj, String nome_nomeFantasia, String sobrenome_razaoSocial, String tipoPessoa,
			String inscEstadual, String inscMunicipal) {

		super();
		this.cpf_cnpj = cpf_cnpj;
		this.nome_nomeFantasia = nome_nomeFantasia;
		this.sobrenome_razaoSocial = sobrenome_razaoSocial;
		this.tipoPessoa = tipoPessoa;
		this.inscEstadual = inscEstadual;
		this.inscMunicipal = inscMunicipal;
	}

	public Fornecedor() {
	}

	@Override
	public String toString() {
		return "\nCPF/CNPJ: " + cpf_cnpj + "\nNome/Nome Fantasia: " + nome_nomeFantasia + "\nSobrenome/Razão Social: "
				+ sobrenome_razaoSocial + "\nTipo de Pessoa: " + tipoPessoa + "\nInscrição Estadual: " + inscEstadual
				+ "\nInscrição Municipal: " + inscMunicipal;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getNome_nomeFantasia() {
		return nome_nomeFantasia;
	}

	public void setNome_nomeFantasia(String nome_nomeFantasia) {
		this.nome_nomeFantasia = nome_nomeFantasia;
	}

	public String getSobrenome_razaoSocial() {
		return sobrenome_razaoSocial;
	}

	public void setSobrenome_razaoSocial(String sobrenome_razaoSocial) {
		this.sobrenome_razaoSocial = sobrenome_razaoSocial;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getInscMunicipal() {
		return inscMunicipal;
	}

	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}
}
