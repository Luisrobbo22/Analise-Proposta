package br.com.fiap.analiseProposta.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="DEVOPS_TB_CONTRATO")
@SequenceGenerator(sequenceName="DEVOPS_TB_CONTRATO_SEQ", name="contrato",allocationSize = 1)
public class Contrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "contrato", strategy = GenerationType.SEQUENCE)
	@Column(name = "CD_CONTRATO")
	private Integer id;

	@NotNull
	@Column(name = "QT_PARCELAS")
	private int qtdParcelas;

	@NotNull
	@Column(name = "VL_TOTAL_FINANCIADO")
	private BigDecimal valorTotalFinanciado;

	@NotNull
	@Column(name = "VL_PARCELA")
	private BigDecimal valorParcela;

	@NotNull
	@Column(name = "DS_CONTRATO")
	private String descricaoContrato;

	@NotNull
	@Column(name = "DT_VENCICMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dataVencimento;

	@NotNull
	@Column(name = "TX_MULTA")
	private double percentualMulta;

	@NotNull
	@Column(name = "TX_JUROS")
	private double percentualJuros;

	@NotNull
	@ManyToOne
	private Cliente cliente;

	public Contrato() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}

	public BigDecimal getValorTotalFinanciado() {
		return valorTotalFinanciado;
	}

	public void setValorTotalFinanciado(BigDecimal valorTotalFinanciado) {
		this.valorTotalFinanciado = valorTotalFinanciado;
	}

	public BigDecimal getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}

	public String getDescricaoProduto() {
		return descricaoContrato;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoContrato = descricaoProduto;
	}

	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getPercentualMulta() {
		return percentualMulta;
	}

	public void setPercentualMulta(double percentualMulta) {
		this.percentualMulta = percentualMulta;
	}

	public double getPercentualJuros() {
		return percentualJuros;
	}

	public void setPercentualJuros(double percentualJuros) {
		this.percentualJuros = percentualJuros;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Contrato)) return false;
		Contrato contrato = (Contrato) o;
		return id.equals(contrato.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
