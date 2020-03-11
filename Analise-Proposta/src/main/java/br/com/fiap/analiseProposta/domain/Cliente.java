package br.com.fiap.analiseProposta.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="DEVOPS_TB_CLIENTE")
@SequenceGenerator(sequenceName="DEVOPS_TB_CLIENTE_SEQ", name="cliente",allocationSize = 1)
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "CD_CLIENTE")
	private Integer id;

	@NotNull
	@Column(name = "NM_CLIENTE", length = 50, nullable = false)
	private String nome;

	@NotNull
	@Column(name = "EMAIL")
	private String email;

	@NotNull
	@Column(name = "DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;

	@NotNull
	@Column(name = "VL_RENDA")
	private BigDecimal renda;

	@NotNull
	@Column(name = "ST_EMPREGO")
	private String desempregado;

	@NotNull
	@Column(name = "ST_SEGURO")
	private String segurado;

	@NotNull
	@Column(name = "ST_CADASTRO_POSITIVO")
	private String CadastroPositovo;

	public Cliente() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public BigDecimal getRenda() {
		return renda;
	}

	public void setRenda(BigDecimal renda) {
		this.renda = renda;
	}

	public String getDesempregado() {
		return desempregado;
	}

	public void setDesempregado(String desempregado) {
		this.desempregado = desempregado;
	}

	public String getSegurado() {
		return segurado;
	}

	public void setSegurado(String segurado) {
		this.segurado = segurado;
	}

	public String getCadastroPositivo() {
		return CadastroPositovo;
	}

	public void setCadastroPositivo(String cadastroPositivo) {
		this.CadastroPositovo = cadastroPositivo;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Cliente)) return false;
		Cliente cliente = (Cliente) o;
		return id.equals(cliente.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
