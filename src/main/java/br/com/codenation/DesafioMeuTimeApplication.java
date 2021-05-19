package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.codenation.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.exceptions.TimeNaoEncontradoException;
import br.com.codenation.model.JogadorModel;
import br.com.codenation.model.TimeModel;

public class DesafioMeuTimeApplication implements MeuTimeInterface {
	
	private List<TimeModel> listaDeTimes = new ArrayList<>();
	
	public DesafioMeuTimeApplication() {
		listaDeTimes = new ArrayList<TimeModel>();		
	}

	/*************************************************************************/
	
	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) {
		
		if (listaDeTimes.contains(id)) {
			throw new IdentificadorUtilizadoException();
		}
		
		TimeModel time = new TimeModel();
		time.setId(id);
		time.setNome(nome);
		time.setDataCriacao(dataCriacao);
		time.setCorUniformePrincipal(corUniformePrincipal);
		time.setCorUniformeSecundario(corUniformeSecundario);

		listaDeTimes.add(time);
		System.out.println(time);
	}

	/*************************************************************************/
	
	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
	
		if (!listaDeTimes.contains(idTime)) {
			throw new TimeNaoEncontradoException();
		}
		
		ArrayList<TimeModel> time = new ArrayList<>();
		
		listaDeTimes.stream().filter(i -> i.getId() == idTime);
		
		JogadorModel jogador = new JogadorModel();
		jogador.setId(id);
		jogador.setIdTime(idTime);
		jogador.setNome(nome);
		jogador.setDataNascimento(dataNascimento);
		jogador.setNivelHabilidade(nivelHabilidade);
		jogador.setSalario(salario);
		
		listaDeTimes.addAll(jogador);
	}

	public void definirCapitao(Long idJogador) {
		throw new UnsupportedOperationException();
	}

	public Long buscarCapitaoDoTime(Long idTime) {
		throw new UnsupportedOperationException();
	}

	public String buscarNomeJogador(Long idJogador) {
		throw new UnsupportedOperationException();
	}

	public String buscarNomeTime(Long idTime) {
		throw new UnsupportedOperationException();
	}

	public List<Long> buscarJogadoresDoTime(Long idTime) {
		throw new UnsupportedOperationException();
	}

	public Long buscarMelhorJogadorDoTime(Long idTime) {
		throw new UnsupportedOperationException();
	}

	public Long buscarJogadorMaisVelho(Long idTime) {
		throw new UnsupportedOperationException();
	}

	public List<Long> buscarTimes() {
		throw new UnsupportedOperationException();
	}

	public Long buscarJogadorMaiorSalario(Long idTime) {
		throw new UnsupportedOperationException();
	}

	public BigDecimal buscarSalarioDoJogador(Long idJogador) {
		throw new UnsupportedOperationException();
	}

	public List<Long> buscarTopJogadores(Integer top) {
		throw new UnsupportedOperationException();
	}

}
