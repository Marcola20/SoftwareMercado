package br.edu.up.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String sku;

	private String ean;
	private String descricao;
	private String qtdeTotal;
	private String unidade;
	private String ncm;
	private String custo;
	private String valorVenda;

	public Produto(String sku, String ean, String descricao, String qtdeTotal, String unidade, String ncm, String custo,
			String valorVenda) {
		super();
		this.sku = sku;
		this.ean = ean;
		this.descricao = descricao;
		this.qtdeTotal = qtdeTotal;
		this.unidade = unidade;
		this.ncm = ncm;
		this.custo = custo;
		this.valorVenda = valorVenda;
	}

	public Produto() {
	}

	@Override
	public String toString() {
		return "\nSKU: " + sku + "\nEAN: " + ean + "\nNome: " + descricao + "\nQuantidade Total: " + qtdeTotal
				+ "\nUnidade: " + unidade + "\nNCM: " + ncm + "\nCusto: " + custo + "\nValor de Venda: " + valorVenda;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getQtdeTotal() {
		return qtdeTotal;
	}

	public void setQtdeTotal(String qtdeTotal) {
		this.qtdeTotal = qtdeTotal;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getCusto() {
		return custo;
	}

	public void setCusto(String custo) {
		this.custo = custo;
	}

	public String getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(String valorVenda) {
		this.valorVenda = valorVenda;
	}
}