package br.com.fiap.analiseProposta.domain;

import br.com.fiap.analiseProposta.domain.enuns.FormaPagamento;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Objects;

@Entity
@Table(name = "DEVOPS_TB_RENEGOCIACAO")
@SequenceGenerator(sequenceName = "DEVOPS_TB_RENEGOCIACAO_SEQ", name = "renegociacao", allocationSize = 1)
public class Renegociacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "renegociacao", strategy = GenerationType.SEQUENCE)
	@Column(name = "CD_RENEGOCIACAO")
	private Integer id;

	@NotNull
	@Column(name = "VL_ENTRADA")
	private BigDecimal valorEntrada;

	private String formaPagamento;

	@NotNull
	@Column(name = "TX_DESCONTO")
	private double taxaDesconto;

	@NotNull
	@Column(name = "QTD_PARCELAS")
	private int qntdParcelas;

	@NotNull
	@Column(name = "DT_PAGAMENTO")
	private Calendar pagamento;

	@NotNull
	@Column(name = "ST_RENEGOCIACAO")
	private String statusRenegociacao;

	@NotNull
	@Column(name = "VL_TOTAL_RENEGOCIACAO")
	private BigDecimal valorTotal;

	@NotNull
	@ManyToOne
	private Contrato contrato;




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public BigDecimal getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(BigDecimal percentualEntrada) {
		this.valorEntrada = percentualEntrada;
	}

	public double getTaxaDesconto() {
		return taxaDesconto;
	}

	public void setTaxaDesconto(double percentualDesconto) {
		this.taxaDesconto = percentualDesconto;
	}

	public int getQntdParcelas() {
		return qntdParcelas;
	}

	public void setQntdParcelas(int qntdParcelas) {
		this.qntdParcelas = qntdParcelas;
	}

	public Calendar getPagamento() {
		return pagamento;
	}

	public void setPagamento(Calendar pagamento) {
		this.pagamento = pagamento;
	}

	public String statusRenegociacao() {
		return statusRenegociacao;
	}

	public void setVigente(String statusRenegociacao) {
		this.statusRenegociacao = statusRenegociacao;
	}


	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}


	public FormaPagamento getFormaPagamento(){
		return FormaPagamento.toEnum(this.formaPagamento);
	}

	public void setFormaPagamento(FormaPagamento pagamento){
		this.formaPagamento = pagamento.getFormaPagamento();
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Renegociacao)) return false;
		Renegociacao that = (Renegociacao) o;
		return id.equals(that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
