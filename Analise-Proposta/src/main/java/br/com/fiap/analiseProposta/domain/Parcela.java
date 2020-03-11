package br.com.fiap.analiseProposta.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;


@Entity
@Table(name = "DEVOPS_TB_PARCELA")
@SequenceGenerator(sequenceName = "DEVOPS_TB_PARCELA_SEQ", name = "parcela", allocationSize = 1)
public class Parcela implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "parcela" ,strategy = GenerationType.SEQUENCE)
	@Column(name = "CD_PARCELA")
	private Integer id;

	@NotNull

	@Column(name = "VL_PARCELA")
	private BigDecimal valor;

	@NotNull
	@Column(name = "DT_VENCIMENTO")
	private Calendar vencimento;

	@NotNull
	@Column(name = "DT_PGTO_PARCELA")
	private Calendar pagamento;

	@NotNull
	@Column(name = "ST_PARCELA")
	private String statusPagamento;


	@NotNull
	@ManyToOne
	private Renegociacao renegociacao;



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Calendar getVencimento() {
		return vencimento;
	}
	public void setVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}
	public Calendar getPagamento() {
		return pagamento;
	}
	public void setPagamento(Calendar pagamento) {
		this.pagamento = pagamento;
	}
	public String isStatusPagamento() {
		return statusPagamento;
	}
	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	public Renegociacao getAcordo() {
		return renegociacao;
	}
	public void setRenegociacao(Renegociacao Renegociacao) {
		this.renegociacao = Renegociacao;
	}
	
	public int getIdRenegociacao(Renegociacao Renegociacao) {
		return Renegociacao.getId();
	}

}
