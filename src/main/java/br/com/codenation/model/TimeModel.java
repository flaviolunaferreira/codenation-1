package br.com.codenation.model;

import java.time.LocalDate;
import java.util.List;

public class TimeModel {
	
	/*************************************************************************/
	
	private Long id;
	private String nome;
	private LocalDate dataCriacao;
	private String corUniformePrincipal;
	private String corUniformeSecundario;
	private JogadorModel capitao;
	private List<JogadorModel> listaDeJogadores;
	
	/*************************************************************************/
	
	public TimeModel(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal,
			String corUniformeSecundario, JogadorModel capitao, List<JogadorModel> listaDeJogadores) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.corUniformePrincipal = corUniformePrincipal;
		this.corUniformeSecundario = corUniformeSecundario;
		this.capitao = capitao;
		this.listaDeJogadores = listaDeJogadores;
	}
	
	public TimeModel() {}
	
	/*************************************************************************/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getCorUniformePrincipal() {
		return corUniformePrincipal;
	}
	public void setCorUniformePrincipal(String corUniformePrincipal) {
		this.corUniformePrincipal = corUniformePrincipal;
	}
	public String getCorUniformeSecundario() {
		return corUniformeSecundario;
	}
	public void setCorUniformeSecundario(String corUniformeSecundario) {
		this.corUniformeSecundario = corUniformeSecundario;
	}
	public JogadorModel getCapitao() {
		return capitao;
	}
	public void setCapitao(JogadorModel capitao) {
		this.capitao = capitao;
	}
	public List<JogadorModel> getListaDeJogadores() {
		return listaDeJogadores;
	}
	public void setListaDeJogadores(List<JogadorModel> listaDeJogadores) {
		this.listaDeJogadores = listaDeJogadores;
	}
	
	/*************************************************************************/
	
	@Override
	public String toString() {
		return "TimeModel [id=" + id + ", nome=" + nome + ", dataCriacao=" + dataCriacao + ", corUniformePrincipal="
				+ corUniformePrincipal + ", corUniformeSecundario=" + corUniformeSecundario + ", capitao=" + capitao
				+ ", listaDeJogadores=" + listaDeJogadores + "]";
	}
	
}
